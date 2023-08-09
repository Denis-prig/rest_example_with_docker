package com.arishin.mySpring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users12")
public class User12 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String username;

    @OneToMany(mappedBy = "user")
    private List<Contact1> contacts;

    public User12(Long id, String username) {
        this.id = id;
        this.username = username;
    }

    // Конструктор по умолчанию, гетеры, сеттеры и т.д.
}