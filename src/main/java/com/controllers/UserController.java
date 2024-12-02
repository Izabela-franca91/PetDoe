package com.controllers;

import com.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.services.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    private User salvarUser(@RequestBody User user) {
        return userService.salvarUser(user);
    }

    @PostMapping("/{id}")
    public List<User> listarUser(Long id) {
        return userService.listatUser();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> obterUserPorId(@PathVariable Long id) {
        return userService.consultarUser(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void deletarUser(@PathVariable Long id) {
        userService.apagarUser(id);
    }
}
