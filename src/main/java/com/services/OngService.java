package com.services;

import com.Models.Ong;
import org.springframework.stereotype.Service;
import com.repository.OngRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OngService {
    private OngRepository ongRepository;

    public Ong salvarOng(Ong ong) {
        return ongRepository.save(ong);
    }

    public List<Ong> listatOng() {
        return ongRepository.findAll();
    }

    public Optional<Ong> consultarOng(Long id) {
        return ongRepository.findById(id);
    }

    public void apagarOng(Long id) {
        ongRepository.deleteById(id);
    }
}
