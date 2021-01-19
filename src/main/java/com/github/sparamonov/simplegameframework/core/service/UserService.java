package com.github.sparamonov.simplegameframework.core.service;

import com.github.sparamonov.simplegameframework.core.domain.Room;
import com.github.sparamonov.simplegameframework.core.domain.User;
import com.github.sparamonov.simplegameframework.core.repository.RoomRepository;
import com.github.sparamonov.simplegameframework.core.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final RoomRepository roomRepository;

    public User getUser(UUID id) {

        return userRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    public User createUser(String name) {
        return userRepository.save(User.builder()
                .name(name)
                .build());
    }

    public Collection<Room> getUserRooms(UUID userId) {

        return roomRepository.findAllByUser(getUser(userId));
    }

    public Room getRoom(UUID userId, UUID roomId) {

        return roomRepository.findById(roomId)
                .filter(room -> room.getUser().getId().equals(userId))
                .orElseThrow(NotFoundException::new);
    }

    public Room createRoom(UUID userId, String name) {

        return roomRepository.save(Room.builder()
                .user(getUser(userId))
                .name(name)
                .build());
    }
}
