package com.example.todomvcmysqlvuejs.api;

import com.example.todomvcmysqlvuejs.jpa.Todo;
import com.example.todomvcmysqlvuejs.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/todos")
public class TodoAPI {
    private final TodoService stockService;

    @Autowired
    public TodoAPI(TodoService stockService){
        this.stockService = stockService;
    }

    @GetMapping
    public ResponseEntity<List<Todo>> findAll(){
        return ResponseEntity.ok(stockService.findAll());
    }

    @PostMapping
    public ResponseEntity saveAll(@Valid @RequestBody List<Todo> todos){
        return ResponseEntity.ok(stockService.saveAll(todos));
    }
}
