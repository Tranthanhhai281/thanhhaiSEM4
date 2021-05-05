package com.example.springboot_res_01.repository;

import com.example.springboot_res_01.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface StudenRepository extends JpaRepository<Student, Integer> {
}
