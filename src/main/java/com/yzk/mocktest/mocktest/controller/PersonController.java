package com.yzk.mocktest.mocktest.controller;

import com.yzk.mocktest.mocktest.model.entity.Person;
import com.yzk.mocktest.mocktest.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping("/gg")
    public ResponseEntity<Person> findPersonByNmae(String name){


        Person person =personService.findPersonbyname(name);
        System.out.println("这是一个难过的故事");

        return ResponseEntity.ok(person);
    }


}
