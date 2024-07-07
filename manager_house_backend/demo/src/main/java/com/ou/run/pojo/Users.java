/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ou.run.pojo;

import java.util.UUID;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Users")
public class Users {

    @Id
    private String id;

    private String Username;
    private String Password;

    public Users(String Username, String Password) {
        this.id = UUID.randomUUID().toString();
        this.Username = Username;
        this.Password = Password;
    }

}
