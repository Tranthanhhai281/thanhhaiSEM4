package com.example.jpamanytomany.jpa;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Publisher{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToMany(mappedBy = "publisher")
    private Set<Book> books = new HashSet<>();

    public Publisher() {

    }
}
