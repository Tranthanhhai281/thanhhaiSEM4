package com.example.jpamanytomanypkextra.repository;

import com.example.jpamanytomanypkextra.model.BookPublisher;
import com.example.jpamanytomanypkextra.model.BookPublisherId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookPublisherRepository extends JpaRepository<BookPublisher, BookPublisherId> {
}
