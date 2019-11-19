package com.example.wbdv2019finalprojectserver.controllers;

import java.util.List;

import com.example.wbdv2019finalprojectserver.models.UserAdmin;
import com.example.wbdv2019finalprojectserver.services.UserAdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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

}