package com.github.sparamonov.simplegameframework.core.web.dto;

import com.github.sparamonov.simplegameframework.core.domain.User;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@Builder
public class UserData {

    String id;

    @NotBlank
    String name;

    public static UserData of(User user) {
        return UserData.builder()
                .id(user.getId().toString())
                .name(user.getName())
                .build();
    }
}
