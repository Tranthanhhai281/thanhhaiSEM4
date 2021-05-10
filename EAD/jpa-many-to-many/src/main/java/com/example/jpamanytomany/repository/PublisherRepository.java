package com.example.jpamanytomany.repository;

import com.example.jpamanytomany.jpa.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher,Integer> {
}
