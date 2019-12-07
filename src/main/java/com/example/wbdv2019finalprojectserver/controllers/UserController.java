package com.example.wbdv2019finalprojectserver.controllers;

import java.util.List;

import com.example.wbdv2019finalprojectserver.models.User;
import com.example.wbdv2019finalprojectserver.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    @GetMapping("/api/users/{userId}")
    public User findUserById(@PathVariable("userId") Integer userId){
        return us.findUserById(userId);
    }

    @DeleteMapping("/api/users/{id}")
    public void deleteUser(@PathVariable("id") Integer Id){
        us.deleteUser(Id);
    }

    @PostMapping("/api/users")
    public User createUser(User user){
        return us.createUser(user);
    }

    @PutMapping("/api/users/{id}")
    public User updateUser(@PathVariable("id") Integer id, @RequestBody User user){
        return us.updateUser(user, id);
    }

}