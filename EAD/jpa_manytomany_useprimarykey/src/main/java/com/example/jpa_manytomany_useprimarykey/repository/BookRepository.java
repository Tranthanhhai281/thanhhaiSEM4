package com.example.jpa_manytomany_useprimarykey.repository;

import com.example.jpa_manytomany_useprimarykey.jpa.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
