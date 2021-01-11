package com.github.sparamonov.simplegameframework.core.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Room extends AbstractEntity {

    @ManyToOne
    @NotNull
    User user;

    @NotBlank
    String name;
}
