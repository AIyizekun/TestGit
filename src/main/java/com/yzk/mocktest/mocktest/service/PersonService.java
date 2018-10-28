package com.yzk.mocktest.mocktest.service;

import com.yzk.mocktest.mocktest.model.entity.Hobby;
import com.yzk.mocktest.mocktest.model.entity.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    public Person findPersonbyname(String name){

        Person p1 = new Person();
        List<Hobby> hobbyList = new ArrayList<>();
        hobbyList.add(Hobby.MOVIE);
        hobbyList.add(Hobby.FOOTBALL);
        p1.setName("小花");
        p1.setId(1);
        p1.setHobbyList(hobbyList);
        return p1;
    }

}
