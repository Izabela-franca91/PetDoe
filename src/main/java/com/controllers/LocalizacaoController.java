package com.controllers;

import com.Models.Localizacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.services.LocalizacaoService;

import java.util.List;

@RestController
@RequestMapping("/localizacoes")
public class LocalizacaoController {
    @Autowired
    private LocalizacaoService localizacaoService;

    @PostMapping
    private Localizacao salvarLocalizacao(@RequestBody Localizacao localizacao) {
        return localizacaoService.salvarLocalizacao(localizacao);
    }

    @PostMapping("/{id}")
    public List<Localizacao> listarOng(Long id) {
        return localizacaoService.listatLocalizacao();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Localizacao> obterConsultaPorId(@PathVariable Long id) {
        return localizacaoService.consultarLocalizacao(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void deletarConsulta(@PathVariable Long id) {
        localizacaoService.apagarOng(id);
    }
}
