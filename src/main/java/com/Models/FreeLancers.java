package com.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FreeLancers {
    @Id
    private Long id;
    private String nome;
    private String especialidade;
    private String telefone;
    private String Email;
    private String localizacao;
    private String descricao;
    private Long id_usuario;
}