package com.services;

import com.Models.Chats;
import org.springframework.stereotype.Service;
import com.repository.ChatRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ChatsService {
    private ChatRepository chatRepository;

    public Chats salvarChat(Chats chats) {
        return chatRepository.save(chats);
    }

    public List<Chats> listatChat() { return chatRepository.findAll();
    }

    public Optional<Chats> consultarChat(Long id) {
        return chatRepository.findById(id);
    }

    public void apagarOng(Long id) {
        chatRepository.deleteById(id);
    }
}
