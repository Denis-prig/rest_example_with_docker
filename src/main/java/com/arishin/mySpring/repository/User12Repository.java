package com.arishin.mySpring.repository;

import com.arishin.mySpring.entity.User12;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User12Repository extends JpaRepository<User12, Long> {
}
