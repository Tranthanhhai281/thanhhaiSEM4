package com.example.jpa_manytomany_useprimarykey;

import com.example.jpa_manytomany_useprimarykey.jpa.Book;
import com.example.jpa_manytomany_useprimarykey.jpa.Publisher;
import com.example.jpa_manytomany_useprimarykey.repository.BookPublisherRepository;
import com.example.jpa_manytomany_useprimarykey.repository.BookRepository;
import com.example.jpa_manytomany_useprimarykey.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaManytomanyUseprimarykeyApplication implements CommandLineRunner {
    @Autowired
    BookRepository bookRepository;
    @Autowired
    PublisherRepository publisherRepository;
    @Autowired
    BookPublisherRepository bookPublisherRepository;

    public static void main(String[] args) {

        SpringApplication.run(JpaManytomanyUseprimarykeyApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {


    }
}
