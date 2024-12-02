package com.controllers;

import com.Models.FreeLancers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.services.FreeLancersService;

import java.util.List;

@RestController
@RequestMapping("/freelancers")
public class FreeLancersController {
    @Autowired
    private FreeLancersService freeLancersService;

    @PostMapping
    private FreeLancers salvarFreeLancers(@RequestBody FreeLancers freeLancers) {
        return freeLancersService.salvarFreelancers(freeLancers);
    }

    @PostMapping("/{id}")
    public List<FreeLancers> listarFreeLancers(Long id) {
        return freeLancersService.listatFreeLancers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<FreeLancers> obteFreeLancersPorId(@PathVariable Long id) {
        return freeLancersService.consultarFreelancers(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void deletarConsulta(@PathVariable Long id) {
        freeLancersService.apagarFreelancers(id);
    }
}
