package com.github.sparamonov.simplegameframework.core.repository;

import com.github.sparamonov.simplegameframework.core.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findById(UUID id);
}
