package com.github.sparamonov.simplegameframework.core.web.dto;

import com.github.sparamonov.simplegameframework.core.domain.Game;
import com.github.sparamonov.simplegameframework.core.domain.Room;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Collection;
import java.util.stream.Collectors;

@Data
@Builder
public class RoomData {

    String id;

    @NotBlank
    String name;

    Collection<GameData> games;

    public static RoomData of(Room room) {
        return RoomData.builder()
                .id(room.getId().toString())
                .name(room.getName())
                .build();
    }

    public static RoomData of(Room room, Collection<Game> games) {
        return RoomData.builder()
                .id(room.getId().toString())
                .name(room.getName())
                .games(games.stream().map(GameData::of).collect(Collectors.toList()))
                .build();
    }
}
