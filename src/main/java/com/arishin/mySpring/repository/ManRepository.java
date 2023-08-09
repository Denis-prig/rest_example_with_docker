package com.arishin.mySpring.repository;

import com.arishin.mySpring.entity.Man;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface ManRepository  extends JpaRepository<Man,Long> {
}
