package com.arishin.mySpring.repository;

import com.arishin.mySpring.entity.Person12;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonTestRepository extends JpaRepository<Person12, Long> {
}
