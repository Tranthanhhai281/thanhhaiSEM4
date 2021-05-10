package com.example.jpamanytomany;

import com.example.jpamanytomany.jpa.Book;
import com.example.jpamanytomany.jpa.Publisher;
import com.example.jpamanytomany.repository.BookRepository;
import com.example.jpamanytomany.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.namespace.QName;

@SpringBootApplication
public class JpaManyToManyApplication implements CommandLineRunner {
    @Autowired
    BookRepository bookRepository;
    @Autowired
    PublisherRepository publisherRepository;


    public static void main(String[] args) {

        SpringApplication.run(JpaManyToManyApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*bookRepository.save(new Book( name: "JavaSpring1"), new Publisher( name: "Publisher1"), new Publisher( name: "Publisher2")));*/
    }
}
