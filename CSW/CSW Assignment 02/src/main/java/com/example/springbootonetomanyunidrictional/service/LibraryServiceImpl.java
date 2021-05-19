package com.example.springbootonetomanyunidrictional.service;

import com.example.springbootonetomanyunidrictional.jpa.Library;
import com.example.springbootonetomanyunidrictional.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryServiceImpl implements LibraryService {

    @Autowired
    private final LibraryRepository libraryRepository;

    public LibraryServiceImpl (LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    @Override
    public List<Library> listLibraries () {
        return libraryRepository.findAll ();
    }


    @Override
    public Optional<Library> getLibraryById (int id) {
        return libraryRepository.findById (id);
    }

    @Override
    public boolean saveLibrary (Library library) {
        libraryRepository.save (library);
        return true;
    }

    @Override
    public boolean deleteLibrary (int id) {
        libraryRepository.findById (id).get ();
        return true;
    }

    @Override
    public boolean updateLibrary (Library library) {
        libraryRepository.save (library);
        return true;
    }


    @Override
    public Page<Library> findPaginated (int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of (pageNo - 1, pageSize);
        return this.libraryRepository.findPaginateLibraryStatus (pageable);
    }
}
