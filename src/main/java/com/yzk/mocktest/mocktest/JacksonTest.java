package com.yzk.mocktest.mocktest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yzk.mocktest.mocktest.model.entity.Person;

import java.util.ArrayList;
import java.util.List;

public class JacksonTest {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Person> personList = new ArrayList<>();

        personList.add(new Person(2,"小花","nan",));
        try {
            String s = objectMapper.writeValueAsString(personList);
            System.out.println(s);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
