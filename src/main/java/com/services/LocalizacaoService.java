package com.services;

import com.Models.Localizacao;
import org.springframework.stereotype.Service;
import com.repository.LocalizacaoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class LocalizacaoService {
    private LocalizacaoRepository localizacaoRepository;

    public Localizacao salvarLocalizacao(Localizacao localizacao) {
        return localizacaoRepository.save(localizacao);
    }

    public List<Localizacao> listatLocalizacao() {
        return localizacaoRepository.findAll();
    }

    public Optional<Localizacao> consultarLocalizacao(Long id) {
        return localizacaoRepository.findById(id);
    }

    public void apagarOng(Long id) {
        localizacaoRepository.deleteById(id);
    }
}


