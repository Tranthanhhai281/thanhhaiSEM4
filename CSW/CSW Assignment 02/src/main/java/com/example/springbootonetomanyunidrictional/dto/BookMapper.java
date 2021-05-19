package com.example.springbootonetomanyunidrictional.dto;

import com.example.springbootonetomanyunidrictional.jpa.Book;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    List<BookDTO> bookDTOList(List<Book> books);
    Book toBook(BookDTO bookDTO);
}
