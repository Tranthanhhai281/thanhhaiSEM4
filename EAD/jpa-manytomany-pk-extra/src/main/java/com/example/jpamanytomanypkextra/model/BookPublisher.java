package com.example.jpamanytomanypkextra.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Book_Publisher")
public class BookPublisher {
   @EmbeddedId
    private BookPublisherId id;
   @ManyToOne
   @MapsId("bookId")
   @JoinColumn(name = "book_id")
    private Book book;
   @MapsId("publisherId")
   @JoinColumn(name = "publisher_id")
   @ManyToOne
    private Publisher publisher;

   @Column(name = "publisher_date")
   private Date publisherdate;

    public BookPublisher(Book book, Publisher publisher, Date publisherdate) {
        this.id = new BookPublisherId(book.getId(), publisher.getId());
        this.book = book;
        this.publisher = publisher;
        this.publisherdate = publisherdate;
    }
}
