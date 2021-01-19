package com.github.sparamonov.simplegameframework.core.web.dto;

import com.github.sparamonov.simplegameframework.core.domain.Game;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@Builder
public class GameData {

    String id;

    @NotBlank
    String type;

    public static GameData of(Game game) {
        return GameData.builder()
                .id(game.getId().toString())
                .type(game.getType())
                .build();
    }
}
