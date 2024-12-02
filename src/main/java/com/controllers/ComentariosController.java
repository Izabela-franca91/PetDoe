package com.controllers;

import com.Models.Comentarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.services.ComentariosService;

import java.util.List;

@RestController
@RequestMapping("/conmentarios")
public class ComentariosController {
    @Autowired
    private ComentariosService comentariosService;

    @PostMapping
    private Comentarios salvarComentarios(@RequestBody Comentarios comentarios) {
        return comentariosService.salvarcomentarios (comentarios);
    }

    @PostMapping("/{id}")
    public List<Comentarios> listarComentarios(Long id) {
        return comentariosService.listatComentarios();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Comentarios> obterComentariosPorId(@PathVariable Long id) {
        return comentariosService.consultarComentarios(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void deletarComenatrios(@PathVariable Long id) {
        comentariosService.apagarComentarios(id);
    }
}
