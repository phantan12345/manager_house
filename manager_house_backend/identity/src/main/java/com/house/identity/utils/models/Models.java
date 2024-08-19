/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.house.identity.utils.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import java.util.Date;
import lombok.Data;

/**
 *
 * @author ADMIN
 */
@Data
public class Models {

    @Column(name = "name")
    private String name;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "update_date")
    private Date updateDate;

    public Models(String name) {
            this.name=name;
       
    }

}
