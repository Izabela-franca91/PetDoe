package com.services;

import com.Models.User;
import org.springframework.stereotype.Service;
import com.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    public User salvarUser(User user) {
        return userRepository.save(user);
    }

    public List<User> listatUser() {
        return userRepository.findAll();
    }

    public Optional<User> consultarUser(Long id) {
        return userRepository.findById(id);
    }

    public void apagarUser(Long id) {
        userRepository.deleteById(id);
    }
}


