package com.example.wbdv2019finalprojectserver.repositories;

import java.util.List;

import com.example.wbdv2019finalprojectserver.models.UserAdmin;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserAdminRepository extends CrudRepository<UserAdmin, Integer>{

    @Query("select useradmin from UserAdmin useradmin")
    public List<UserAdmin> findAllUserAdmins();
}