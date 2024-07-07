/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ou.run.Services.Users;

import com.ou.run.Services.Users.DTO.UserDTO;
import com.ou.run.pojo.Users;

/**
 *
 * @author ADMIN
 */
public interface IUserService  {
    Users save(UserDTO input);
}
