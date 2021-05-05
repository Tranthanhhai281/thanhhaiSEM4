package com.example.todomvcmysqlvuejs.service;

import com.example.todomvcmysqlvuejs.jpa.Todo;
import com.example.todomvcmysqlvuejs.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository stockRepository;

    public List<Todo> findAll(){
        return stockRepository.findAll();
    }

    public List<Todo> saveAll(List<Todo> todos){
        return stockRepository.saveAll(todos);
    }
}
