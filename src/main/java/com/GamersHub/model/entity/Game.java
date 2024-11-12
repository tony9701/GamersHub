package com.GamersHub.model.entity;

import com.GamersHub.model.entity.baseEntity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jdk.jfr.Enabled;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "games")
public class Game extends BaseEntity {

    @Column(unique = true, nullable = false)
    @NotBlank
    private String name;


    @Column(nullable = false)
    @NotBlank
    private String genre;

    @Column(nullable = false)
    @NotBlank
    private String description;


}
