package com.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Chats {

        @Id
        private Long id;
        private Long usuario_id;
        private Long usuario_id_2;
        private String mensagens;
        private String date;


}
