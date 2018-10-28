package com.yzk.mocktest.mocktest;

import com.yzk.mocktest.mocktest.model.entity.Person;

import java.util.Map;

public class CompareTest {

    public static void main(String[] args) {

        String[] array = {"zhe", "shi", "hao", "haui", "wui"};

        String[] a2 = {"shi", "shida"};

        System.out.println(array[4].compareTo(a2[0]));
        Integer da = 89;
        Integer xiao = 23;

        System.out.println(da.compareTo(xiao));

        String s = "    zhe  me  ";

        System.out.println(s.trim());
        //java8新特性
        String result = s.join(",", "diyige", "john", "wudi", "bielauinali");
        //复制数组
        System.out.println(result);
        String[] bbk = new String[5];
        System.arraycopy(array, 0, bbk, 0, 3);
        for (int i = 0; i < bbk.length; i++) {
            System.out.println(bbk[i]);
        }
        //打印控制台
        System.out.println(System.console());
        //遍历map,先取得该map的
        Map<String, String> getenv = System.getenv();

//        for (Map.Entry<String, String> entry : getenv.entrySet()) {
//            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
//        }
        getenv.forEach((key,value)->{
            System.out.println(key+":"+value);
        });

        Person p1 = new Person();
        p1.setName("tom");
        p1.setGender("ann");

      Class<Person> personClass = (Class<Person>) p1.getClass();
        //返回调用对象的类名
        System.out.println(personClass.getName().toString());
    }
}