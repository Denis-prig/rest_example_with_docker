package com.arishin.mySpring.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@Entity
@NoArgsConstructor
public class Man {
    @Id
    @GeneratedValue()
    @Column(name = "id")
    private Long id;

   @ManyToOne
   @JoinColumn(name = "tutorial_id", nullable = false)
   private Name nameMan;

    public Man(long l, String name) {
    }
}
