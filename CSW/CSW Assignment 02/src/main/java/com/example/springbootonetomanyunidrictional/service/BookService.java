package com.example.springbootonetomanyunidrictional.service;


import com.example.springbootonetomanyunidrictional.jpa.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Book> listBook();

    Optional<Book> getBookById(int id);
    Book saveBook(Book book);
    void deleteBook(int id);
    boolean updateBook(Book book);
    List<Book> lisBookByLibrary(int library_id);

}
