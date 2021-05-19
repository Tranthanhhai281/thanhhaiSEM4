package com.example.springbootonetomanyunidrictional.repository;

import com.example.springbootonetomanyunidrictional.jpa.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface BookRepository extends JpaRepository<Book, Integer> {

    Page<Book> findByLibraryId (Integer libraryId, Pageable pageable);


    @Modifying
    @Transactional
    @Query("DELETE FROM Book b WHERE b.library.id = ?1")
    void deleteByLibraryId (Integer libraryId);

    List<Book> findByLibraryId (int library_id);
}
