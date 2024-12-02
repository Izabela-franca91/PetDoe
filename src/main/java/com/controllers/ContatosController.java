package com.controllers;

import com.Models.Contatos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.services.ContatosService;

import java.util.List;

@RestController
@RequestMapping("/contatos")
public class ContatosController {
    @Autowired
    private ContatosService contatosService;

    @PostMapping
    private Contatos salvarContatos(@RequestBody Contatos contatos) {
        return contatosService.salvarContatos(contatos);
    }

    @PostMapping("/{id}")
    public List<Contatos> listarContatos(Long id) {
        return contatosService.listatContatos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contatos> obterContatosPorId(@PathVariable Long id) {
        return contatosService.consultarContatos(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void deletarContatos(@PathVariable Long id) {
        contatosService.apagarContatos(id);
    }
}
