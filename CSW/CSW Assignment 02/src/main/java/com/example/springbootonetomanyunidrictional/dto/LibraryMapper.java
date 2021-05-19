package com.example.springbootonetomanyunidrictional.dto;

import com.example.springbootonetomanyunidrictional.jpa.Library;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface LibraryMapper {
    List<LibraryDTO> bookDTOList(List<Library> libraries);
    Library toLibrary(LibraryDTO libraryDTO);
}
