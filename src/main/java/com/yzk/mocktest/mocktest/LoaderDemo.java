package com.yzk.mocktest.mocktest;


import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LoaderDemo {

    public static void main(String[] args) {
        //Math类的方法与及静态对象
//        System.out.println( Math.abs(-455.203));
//        //流api
//        List<String> string = new ArrayList<>();
//        string.add("白色");
//        string.add("黄色");
//        string.add("黑色");
//        string.add("绿色");
//        string.add("红色");
//        string.add("紫色");
//        string.add("蓝色");
//
//        List<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(54);
//        list.add(32);
//        list.add(43);
//        list.add(34);
//        list.add(3);
//
//        //获取一个流中的最小值
//        Stream<Integer> stream = list.stream();
//        Optional<Integer> min = stream.min(Integer::compareTo);
//        if(min.isPresent()){
//            System.out.println(min.get());
//
//        }
//        //获取流中最大值
//        Stream<Integer> streamMax = list.stream();
//        Optional<Integer> max = streamMax.max(Integer::compareTo);
//        if (max.isPresent()){
//            System.out.println(max.get());
//        }
//        //将流排序
//        Stream<Integer> sorted = list.stream().sorted();
//        System.out.print("排序后的流:");
//        sorted.forEach((n)-> System.out.print(n+","));
//        System.out.println();
//
//        //排除偶数
//        Stream<Integer> filterStream = list.stream().filter((n) -> (n % 2) == 1);
//        System.out.print("集合中的奇数:");
//        filterStream.forEach((n)-> System.out.print(n + ","));
//        System.out.println();
//        System.out.println("-----");
//        System.out.println("list中的值");
//        list.stream().forEach((n)-> System.out.print(n + ","));

        List<Integer> test = new ArrayList<Integer>();
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        test.add(6);
        String join = StringUtils.join(test.toArray(), ",");

        System.out.println(join);




//    string.forEach((String) ->{
//        if (string.get(4).equals("绿色")){
//            System.out.println("对了");
//        }
//    });
//    //流API的中间操作与终端操作的区别
//        Set<Integer> collectSet = Stream.of(1, 2, 3, 4,4,3,2,1)
//                .collect(Collectors.toSet());
//        System.out.println("collectSet: " + collectSet);
//        //流分割数据块
//        Map<Boolean,List<Integer>> stream = Stream.of(1,2,3,4)
//                .collect(Collectors.partitioningBy(it -> it % 2 == 0));
//        System.out.println("分割的值:"+stream);
//
//        //分割数据块后统计值
//        Map<Boolean, Long> partiCount = Stream.of(1, 2, 3, 4)
//                .collect(Collectors.partitioningBy(it -> it.intValue() % 2 == 0,
//                        Collectors.counting()));
//        System.out.println("partiCount: " + partiCount);



    }
}
