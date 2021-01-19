package com.github.sparamonov.simplegameframework.core.repository;

import com.github.sparamonov.simplegameframework.core.domain.Game;
import com.github.sparamonov.simplegameframework.core.domain.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface GameRepository extends JpaRepository<Game, String> {

    Collection<Game> findAllByRoom(Room room);
}
