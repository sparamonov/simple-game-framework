package com.github.sparamonov.simplegameframework.core.service;

import com.github.sparamonov.simplegameframework.core.domain.Game;
import com.github.sparamonov.simplegameframework.core.domain.Room;
import com.github.sparamonov.simplegameframework.core.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class GameService {

    private final GameRepository gameRepository;

    public Collection<Game> getRoomGames(Room room) {

        return gameRepository.findAllByRoom(room);
    }
}
