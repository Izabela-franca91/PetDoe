package com.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Localizacao {
        @Id
        private Long id;
        private Long usuario_id;
        private String localizacacao;

}
