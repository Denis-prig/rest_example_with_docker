package com.arishin.mySpring.services;

import com.arishin.mySpring.entity.*;
import com.arishin.mySpring.repository.*;
import org.springframework.stereotype.Service;



@Service
public class EntityServices {

    private EntityTwoRepository entityTwoRepository;
    private PersonTestRepository personTestRepository;
    private NameRepository nameRepository;
    private ManRepository manRepository;
    private Contact1Repository contact1Repository;
    private User12Repository user12Repository;



    public EntityServices(EntityTwoRepository entityTwoRepository,
                          PersonTestRepository personTestRepository,
                          NameRepository nameRepository,
                          ManRepository manRepository,
                          Contact1Repository contact1Repository,
                          User12Repository user12Repository) {
        this.entityTwoRepository = entityTwoRepository;
        this.personTestRepository = personTestRepository;
        this.nameRepository = nameRepository;
        this.manRepository = manRepository;
        this.contact1Repository = contact1Repository;
        this.user12Repository = user12Repository;
    }

    public String saveToDB(Person12 person12) {

        personTestRepository.save(person12);
        return person12.toString();
    }

    public String seveName() {
        Name n = new Name(1L, "Ira");
        nameRepository.save(n);
        return n.toString() + "urteu";
    }

    public String nameAndMan() {
        Name n = new Name(1L, "Denis");
        Man m = new Man(2L, n.getName());

        return null;
    }
    public String contactAndUser(){

        User12 user12 = new User12(1L, "denis");
        Contact1 contact1= new Contact1(1L, "gugu", "fuyfuk", user12);
        user12Repository.save(user12);
        contact1Repository.save(contact1);

        return contact1.toString();
    }
}
