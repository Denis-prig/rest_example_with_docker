package com.arishin.mySpring.repository;

import com.arishin.mySpring.entity.EntityTwo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntityTwoRepository extends JpaRepository<EntityTwo, Long> {
}
