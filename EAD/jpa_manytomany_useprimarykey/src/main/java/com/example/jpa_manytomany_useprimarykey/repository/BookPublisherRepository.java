package com.example.jpa_manytomany_useprimarykey.repository;

import com.example.jpa_manytomany_useprimarykey.jpa.BookPublisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookPublisherRepository extends JpaRepository<BookPublisher,Integer> {
}
