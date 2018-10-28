package com.yzk.mocktest.mocktest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamMapTest {
    public static void main(String[] args) {

        List<String> fa = new ArrayList<>();

        fa.add("beijing");
        fa.add("wuhan");
        fa.add("shanghai");
        fa.add("guangzzhou");
        fa.add("xiangganng");
        //测试流中的添加String分隔符的demo

        String collect = fa.stream().collect(Collectors.joining(","));

        System.out.println(collect);

        List<String> cities = Arrays.asList(
                "Milan", "London", "New York", "San Francisco");

        String citiesCommaSeparated = String.join(",", cities);

        System.out.println(citiesCommaSeparated);

    }

}
