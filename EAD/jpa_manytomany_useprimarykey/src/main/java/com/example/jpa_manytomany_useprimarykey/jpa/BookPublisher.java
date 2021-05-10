package com.example.jpa_manytomany_useprimarykey.jpa;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class BookPublisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "book_id")
    private Book book;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;

    private Date publishData;

    public BookPublisher(Book book, Publisher publisher, Date publishData) {
        this.book = book;
        this.publisher = publisher;
        this.publishData = publishData;
    }

    public BookPublisher() {

    }
}
