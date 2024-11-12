package com.GamersHub.model.entity;

import com.GamersHub.model.entity.baseEntity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "messages")
public class Message extends BaseEntity {

    @Column(name = "sender_name", nullable = false)
    @NotBlank
    private String senderName;

    @Column(name = "receiver_name", nullable = false)
    @NotBlank
    private String receiverName;

    @Column(nullable = false)
    @NotBlank
    private String text;

    @NotBlank
    private LocalDateTime timestamp;
}
