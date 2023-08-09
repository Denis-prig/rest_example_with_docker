package com.arishin.mySpring.repository;

import com.arishin.mySpring.entity.Contact1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Contact1Repository  extends JpaRepository<Contact1 ,Long> {
}
