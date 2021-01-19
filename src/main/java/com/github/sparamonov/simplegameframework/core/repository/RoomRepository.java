package com.github.sparamonov.simplegameframework.core.repository;

import com.github.sparamonov.simplegameframework.core.domain.Room;
import com.github.sparamonov.simplegameframework.core.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

public interface RoomRepository extends JpaRepository<Room, String> {

    Collection<Room> findAllByUser(User user);

    Optional<Room> findById(UUID id);
}
