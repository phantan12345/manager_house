/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ou.run.Services.Users;

import com.ou.run.Services.Users.DTO.UserDTO;
import com.ou.run.pojo.Users;
import com.ou.run.respository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ADMIN
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private UserRespository UserRespository;

    @Override
    public Users save(UserDTO input) {
        return UserRespository.save(new Users(input.getUsername(), input.getPassword()));
    }

}
