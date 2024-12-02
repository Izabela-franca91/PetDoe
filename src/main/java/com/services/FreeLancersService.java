package com.services;

import com.Models.FreeLancers;
import org.springframework.stereotype.Service;
import com.repository.FreeLancersRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FreeLancersService {
    private FreeLancersRepository freeLancersRepository;

    public FreeLancers salvarFreelancers(FreeLancers freeLancers) {
        return freeLancersRepository.save(freeLancers);
    }

    public List<FreeLancers> listatFreeLancers() {
        return freeLancersRepository.findAll();
    }

    public Optional<FreeLancers> consultarFreelancers(Long id) {
        return freeLancersRepository.findById(id);
    }

    public void apagarFreelancers(Long id) {
        freeLancersRepository.deleteById(id);
    }
}
