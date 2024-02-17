package com.arishin.mySpring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@NoArgsConstructor
@Entity
@Table(name = "contacts")
public class Contact1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String type;

    @Column
    private String data;

    @ManyToOne
    private User12 user;

    public Contact1(Long id, String type, String data, User12 user) {
        this.id = id;
        this.type = type;
        this.data = data;
        this.user = user;
    }

    // Конструктор по умолчанию, геттеры, сеттеры и т.д.
}