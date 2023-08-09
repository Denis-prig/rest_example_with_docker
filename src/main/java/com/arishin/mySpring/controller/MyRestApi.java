package com.arishin.mySpring.controller;

import com.arishin.mySpring.entity.Comment;
import com.arishin.mySpring.entity.EntityTwo;
import com.arishin.mySpring.entity.Person12;
import com.arishin.mySpring.repository.EntityTwoRepository;
import com.arishin.mySpring.repository.PersonTestRepository;
import com.arishin.mySpring.services.EntityServices;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.aspectj.weaver.Lint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
//http://localhost:8080/swagger-ui.html
@Api(description = "Мой сервис для тестирования спринг")
@RestController("/api")
public class MyRestApi {

    private PersonTestRepository personTestRepository;

    private EntityTwoRepository entityTwoRepository;

    private EntityServices entityServices;

//FOR DOCKER   (container) docker run  --network=host  -p 8080:8080 rest-postgress
//http://localhost:8080/12
    public MyRestApi(PersonTestRepository personTestRepository, EntityTwoRepository entityTwoRepository, EntityServices entityServices) {
        this.personTestRepository = personTestRepository;
        this.entityTwoRepository = entityTwoRepository;
       this.entityServices = entityServices;
    }
    @ApiOperation("Получение списка person12 ")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success|OK"),
            @ApiResponse(code = 401, message = "Not Authorized!"),
            @ApiResponse(code = 403, message = "Forbidden!"),
            @ApiResponse(code = 404, message = "Not Found!") })
    @GetMapping("/12")
    public String hellorest() {
        Person12 person12 = new Person12(1L, "denis");
        Person12 person13 = new Person12(2L, "denis1");
        Person12 person14 = new Person12(3L, "denis2");
        Person12 person15 = new Person12(4L, "denis3");
        Person12 person16 = new Person12(5L, "denis4");
        Person12 person17 = new Person12(6L, "denis5");
        Person12 person18 = new Person12(7L, "denis6");
        personTestRepository.save(person14);
        personTestRepository.save(person13);
        personTestRepository.save(person15);
        personTestRepository.save(person16);
        personTestRepository.save(person17);
        personTestRepository.save(person18);
        Optional<Person12> person123 = personTestRepository.findById(7L);
        person12 = person123.get();
        System.out.println(person12);

        EntityTwo e = new EntityTwo("name");
        entityTwoRepository.save(e);
        return "Hello" + person12;
    }
    @ApiOperation("Создание  элементов Person")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success|OK"),
            @ApiResponse(code = 401, message = "Not Authorized!"),
            @ApiResponse(code = 403, message = "Forbidden!"),
            @ApiResponse(code = 404, message = "Not Found!") })
    @PostMapping("{id}/{name}")
    public String postrest(@PathVariable int id, @PathVariable String name) {
        long ids = id;
        Long temp = ids;
        Person12 person1234 = new Person12(temp, name);

        return "Our new Person   " + person1234;
    }

    @ApiOperation("Создание разнообразных элементов ")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success|OK"),
            @ApiResponse(code = 401, message = "Not Authorized!"),
            @ApiResponse(code = 403, message = "Forbidden!"),
            @ApiResponse(code = 404, message = "Not Found!") })
    @PostMapping("{id}/{name}/test")
    public String testApiWithServices(@PathVariable int id, @PathVariable String name) {
        long ids = id;
        Long temp = ids;
        Person12 person1234 = new Person12(temp, name);
        entityServices.saveToDB(person1234);
        entityServices.seveName();
        entityServices.nameAndMan();
      String tmp =  entityServices.contactAndUser();
        return "Our new Person by Services created  " + person1234+ "hgu   ";
    }
}
