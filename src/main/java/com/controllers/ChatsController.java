package com.controllers;

import com.Models.Chats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.services.ChatsService;

import java.util.List;

@RestController
@RequestMapping("/chats")
public class ChatsController {
    @Autowired
    private ChatsService chatsService;

    @PostMapping
    private Chats salvarOng(@RequestBody Chats chats) {
        return chatsService.salvarChat(chats);
    }

    @PostMapping("/{id}")
    public List<Chats> listarChats(Long id) {
        return chatsService.listatChat();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Chats> obterChatsPorId(@PathVariable Long id) {
        return chatsService.consultarChat(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void deletarChats(@PathVariable Long id) {
        chatsService.apagarOng(id);
    }
}
