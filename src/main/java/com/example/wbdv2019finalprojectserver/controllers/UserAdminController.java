package com.example.wbdv2019finalprojectserver.controllers;

import java.util.List;

import com.example.wbdv2019finalprojectserver.models.UserAdmin;
import com.example.wbdv2019finalprojectserver.services.UserAdminService;

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
class UserAdminController{

    @Autowired
    UserAdminService uas;

    @GetMapping("/api/useradmins")
    public List<UserAdmin> findAllUserAdmins(){
        return uas.findAllUserAdmins();      
    }
    @GetMapping("/api/useradmins/{useradminId}")
    public UserAdmin findUserById(@PathVariable("useradminId") Integer userId){
        return uas.findUserAdminById(userId);
    }

    @DeleteMapping("/api/usersadmins/{id}")
    public void deleteUserAdmin(@PathVariable("id") Integer Id){
        uas.deleteUserAdmin(Id);
    }

    @PostMapping("/api/useradmins")
    public UserAdmin createUser(@RequestBody UserAdmin userAdmin){
        return uas.createUserAdmin(userAdmin);
    }

    @PutMapping("/api/useradmins/{id}")
    public UserAdmin updateUser(@PathVariable("id") Integer id, @RequestBody UserAdmin user){
        return uas.updateUserAdmin(user, id);
    }

}