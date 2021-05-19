package com.example.springbootonetomanyunidrictional.service;


import com.example.springbootonetomanyunidrictional.jpa.Book;
import com.example.springbootonetomanyunidrictional.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private final BookRepository bookRepository;

    public BookServiceImpl (BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> listBook () {
        return bookRepository.findAll ();
    }

    @Override
    public Optional<Book> getBookById (int id) {
        return bookRepository.findById (id);
    }

    @Override
    public Book saveBook (Book book) {
        return bookRepository.save (book);
    }

    @Override
    public void deleteBook (int id) {
         bookRepository.deleteById (id);
    }

    @Override
    public boolean updateBook (Book book) {
        try{
            bookRepository.save(book);
            return true;

        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Book> lisBookByLibrary (int library_id) {
        try{
            List<Book> books = bookRepository.findByLibraryId (library_id);

            return books;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
