package com.example.JavaExercicio.repositories;

import com.example.JavaExercicio.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
