package com.example.springbootonetomanybidrectrestmysql.repository;

import com.example.springbootonetomanybidrectrestmysql.jpa.Library;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface LibraryRepository extends JpaRepository<Library, Integer> {
    @Transactional
    @Modifying
    @Query("DELETE FROM Book b WHERE b.library.id = ?1")
    void deleteByLibraryId(Integer libraryId);


    List<Library> findAllByStatus(int status);

    @Query("SELECT c FROM Library c WHERE  id = ?1")
    List<Library> getByLibraryId(int id);

    @Query("SELECT c FROM Library c WHERE status = 1 OR status = 2")
    List<Library> getAllLibraryStatus();

    @Query("SELECT c FROM Library c WHERE status = 1 OR status = 2")
    Page<Library> findPaginateLibraryStatus(Pageable pageable);

    @Query("SELECT c FROM Library c WHERE name = ?1 AND id = ?2")
    Library findByLibraryName(String name);
}
