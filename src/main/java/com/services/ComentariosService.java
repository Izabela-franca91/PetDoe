package com.services;

import com.Models.Comentarios;
import org.springframework.stereotype.Service;
import com.repository.ComentariosRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ComentariosService {
    private ComentariosRepository comentariosRepository;

    public Comentarios salvarcomentarios(Comentarios comentarios) {
        return comentariosRepository.save(comentarios);
    }

    public List<Comentarios> listatComentarios() {
        return comentariosRepository.findAll();
    }

    public Optional<Comentarios> consultarComentarios(Long id) {
        return comentariosRepository.findById(id);
    }

    public void apagarComentarios(Long id) {
        comentariosRepository.deleteById(id);
    }
}

