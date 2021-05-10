package com.example.jpamanytomanypkextra.repository;

import com.example.jpamanytomanypkextra.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
