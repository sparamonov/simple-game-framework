package com.github.sparamonov.simplegameframework.core.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.UUID;

@Getter
@MappedSuperclass
public class AbstractEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @Version
    private Long version;
}
