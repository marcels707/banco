package com.banco.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.banco.persona.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
