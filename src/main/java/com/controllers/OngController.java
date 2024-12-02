package com.controllers;

import com.Models.Ong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.services.OngService;

import java.util.List;

@RestController
@RequestMapping("/ongs")
public class OngController {

    @Autowired
    private OngService ongService;

    @PostMapping
    private Ong salvarOng(@RequestBody Ong ong) {
        return ongService.salvarOng(ong);
    }

    @PostMapping("/{id}")
    public List<Ong> listarOng(Long id) {
        return ongService.listatOng();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ong> obterConsultaPorId(@PathVariable Long id) {
        return ongService.consultarOng(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void deletarConsulta(@PathVariable Long id) {
        ongService.apagarOng(id);
    }
}
