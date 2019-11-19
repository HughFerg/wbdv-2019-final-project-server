package com.example.wbdv2019finalprojectserver.services;

import java.util.List;

import com.example.wbdv2019finalprojectserver.models.UserAdmin;
import com.example.wbdv2019finalprojectserver.repositories.UserAdminRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAdminService{

    @Autowired
    UserAdminRepository repository;

    public List<UserAdmin> findAllUserAdmins(){
        return repository.findAllUserAdmins();    
    }

}