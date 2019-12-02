package com.example.wbdv2019finalprojectserver.repositories;

import java.util.List;

import com.example.wbdv2019finalprojectserver.models.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>{

    @Query("select user from User user")
    public List<User> findAllUsers();
}