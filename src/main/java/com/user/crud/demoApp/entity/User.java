package com.user.crud.demoApp.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name="user_data")
public class User {

    private String userId;
    private String firstName;
    private String lastName;
    private String mobile;

}
