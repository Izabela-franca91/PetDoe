package com.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Comentarios {
    @Id
    private Long id;
    private Long usuario_id;
    private Long ong_id;
    private Long freelancer_id;
    private String texto;
    private Date data;
}
