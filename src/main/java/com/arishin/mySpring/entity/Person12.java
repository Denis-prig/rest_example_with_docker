package com.arishin.mySpring.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person12 {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;

    public Person12(long l, String denis) {
        this.id=l;
        this.name =denis;
    }

    @Override
    public String toString() {
        return "Person12{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
