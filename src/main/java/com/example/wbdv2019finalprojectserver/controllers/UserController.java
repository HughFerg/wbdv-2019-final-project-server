package com.example.wbdv2019finalprojectserver.controllers;

import java.util.List;

import com.example.wbdv2019finalprojectserver.models.User;
import com.example.wbdv2019finalprojectserver.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
@RestController
class UserController{

    @Autowired
    UserService us;

    @GetMapping("/api/users")
    public List<User> findAllUsers(){
        return us.findAllUsers();       
    }

}