package com.example.springbootonetomanyunidrictional.service;

import com.example.springbootonetomanyunidrictional.jpa.Library;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface LibraryService {
    List<Library> listLibraries();

    Optional<Library> getLibraryById(int id);
    boolean saveLibrary(Library library);
    boolean deleteLibrary(int id);
    boolean updateLibrary(Library library);
    Page<Library> findPaginated(int pageNo, int pageSize);
}
