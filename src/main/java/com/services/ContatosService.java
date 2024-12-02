package com.services;

import com.Models.Contatos;
import org.springframework.stereotype.Service;
import com.repository.ContatosRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ContatosService {
    private ContatosRepository contatosRepository;

    public Contatos salvarContatos(Contatos contatos) {
        return contatosRepository.save(contatos);
    }

    public List<Contatos> listatContatos() {
        return contatosRepository.findAll();
    }

    public Optional<Contatos> consultarContatos(Long id) {
        return contatosRepository.findById(id);
    }

    public void apagarContatos(Long id) {
        contatosRepository.deleteById(id);
    }
}

