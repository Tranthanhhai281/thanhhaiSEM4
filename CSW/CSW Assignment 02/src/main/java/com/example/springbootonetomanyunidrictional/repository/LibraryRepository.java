package com.example.springbootonetomanyunidrictional.repository;

import com.example.springbootonetomanyunidrictional.jpa.Library;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, Integer> {
    Page<Library> findPaginateLibraryStatus (Pageable pageable);
}
