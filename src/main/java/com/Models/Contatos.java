package com.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity

public class Contatos {
        @Id
        private Long id;
        private Long usuario_id;
        private String nome;
        private String tipo;
        private Date data;

}
