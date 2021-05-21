package com.example.springbootrestqhvongrelationshipmysql.jpa;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;

@Data
@EqualsAndHashCode(exclude = {"caterory","author","BookPublisher"})
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;

    @ManyToOne
    @JoinColumn(name = "caterory_id")
    @JsonIgnoreProperties("books")
    private Caterory caterory;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "book_author",
            joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "author_id", referencedColumnName = "id"))
    @JsonIgnoreProperties("books")
    private Set<Author> authors;
}
