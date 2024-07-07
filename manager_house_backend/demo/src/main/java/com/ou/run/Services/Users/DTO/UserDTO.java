/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ou.run.Services.Users.DTO;

import lombok.Data;

/**
 *
 * @author ADMIN
 */
@Data
public class UserDTO {

    public String Username;
    public String Password;

    public UserDTO(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }

}
