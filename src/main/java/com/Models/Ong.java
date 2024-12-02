package com.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ong {
    @Id
    private Long id;
    private String name;
    private String localizacao;
    private String descricao;
    private String telefone;
    private Long usuario_id;
}
