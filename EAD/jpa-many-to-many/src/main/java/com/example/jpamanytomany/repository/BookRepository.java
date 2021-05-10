package com.example.jpamanytomany.repository;

import com.example.jpamanytomany.jpa.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
