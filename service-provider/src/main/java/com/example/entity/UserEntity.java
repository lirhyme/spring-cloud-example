package com.example.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class UserEntity {

    /**
     * 公众号openid
     */
    @Id
    private String id;

    private String firstName;

    private String lastName;
}

