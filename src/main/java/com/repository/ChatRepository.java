package com.repository;

import com.Models.Chats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Chats, Long> {
}
