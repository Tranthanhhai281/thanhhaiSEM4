package com.example.jpa_manytomany_useprimarykey.repository;

import com.example.jpa_manytomany_useprimarykey.jpa.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher,Integer> {
}
