package com.yzk.mocktest.mocktest.model.entity;

import java.util.List;

public class Person {
    private Integer id;
    private String name;
    private String gender;
    private List<Hobby> hobbyList;
    private String addr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Hobby> getHobbyList() {
        return hobbyList;
    }

    public void setHobbyList(List<Hobby> hobbyList) {
        this.hobbyList = hobbyList;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setHobbyList() {
    }

    public Person(){

    }
    public Person(Integer id, String name, String gender, List<Hobby> hobbyList, String addr) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.hobbyList = hobbyList;
        this.addr = addr;
    }
}
