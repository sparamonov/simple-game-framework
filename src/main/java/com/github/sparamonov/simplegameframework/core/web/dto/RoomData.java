package com.github.sparamonov.simplegameframework.core.web.dto;

import com.github.sparamonov.simplegameframework.core.domain.Room;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@Builder
public class RoomData {

    String id;

    @NotBlank
    String name;

    public static RoomData of(Room room) {
        return RoomData.builder()
                .id(room.getId().toString())
                .name(room.getName())
                .build();
    }
}
