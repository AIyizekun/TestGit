package com.yzk.mocktest.mocktest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yzk.mocktest.mocktest.model.entity.Hobby;
import com.yzk.mocktest.mocktest.model.entity.Person;

import java.util.ArrayList;
import java.util.List;

public class JacksonTest {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Person> personList = new ArrayList<>();
        List<Hobby> hobbyList  = new ArrayList<>();
        hobbyList.add(Hobby.FOOTBALL);

        personList.add(new Person(2,"小花","nan",hobbyList,"湖北武汉"));
        try {
            //将list格式化成json数据,然后可以传输到网络中,俗称序列化
            String s = objectMapper.writeValueAsString(personList);
            System.out.println(s);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


    }
}
