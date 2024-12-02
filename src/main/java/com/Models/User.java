package com.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    private Long id;
    private String name;
    private String email;
    private String pass;
    private String dtNasc;
    private String adress;
    private String phone;

}
