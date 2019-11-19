package com.example.wbdv2019finalprojectserver.services;

import java.util.List;
import com.example.wbdv2019finalprojectserver.models.User;
import com.example.wbdv2019finalprojectserver.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService{

    @Autowired
    UserRepository repository;

    public List<User> findAllUsers(){
        return repository.findAllUsers();    
    }

}