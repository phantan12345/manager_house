/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ou.run.respository;

import com.ou.run.pojo.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author ADMIN
 */
public interface UserRespository extends MongoRepository<Users, String> {

}
