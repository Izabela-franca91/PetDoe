package com.repository;

import com.Models.Contatos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatosRepository  extends JpaRepository<Contatos, Long> {
}
