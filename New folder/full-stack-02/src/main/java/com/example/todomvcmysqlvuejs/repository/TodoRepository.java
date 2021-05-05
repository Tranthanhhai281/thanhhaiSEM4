package com.example.todomvcmysqlvuejs.repository;

import com.example.todomvcmysqlvuejs.jpa.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
