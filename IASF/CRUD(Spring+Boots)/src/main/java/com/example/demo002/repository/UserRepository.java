package com.example.demo002.repository;

import com.example.demo002.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    //biz method
}
