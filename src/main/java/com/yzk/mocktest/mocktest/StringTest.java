package com.yzk.mocktest.mocktest;

public class StringTest {

    public static void main(String[] args) {

        //字符串数组
        char[] chars = {'a','b','c','d','e','f','g'};
        //String构造函数,使用字符数组构造
        String s1 = new String(chars);

        //使用字符数组,指定下标创建
        String s = new String(chars,3,4);
        System.out.println(s);
        //使用字符串创建
        String s2 = new String(s1);
        System.out.println(s2);

        //网络中使用二进制传输,使用字节数组创建字符串
        byte chrs[] = {67,68,69,70,78};

        String s3 = new String(chrs);
        String s4 = new String(chrs,1,3);

        System.out.println("s3= "+s3);
        System.out.println("s4= "+ s4);

        //使用StringBuffer以及StringBulider创建

        StringBuffer sbf = new StringBuffer("hello");

        StringBuilder sbu = new StringBuilder("world");

        sbu.append("马丹");

        String s5 = new String(sbf);
        String s6 = new String(sbu);
        System.out.println(s5+s5.length());
        System.out.println(s6);
        //字符串连接的优先级
        String s7 = "love"+2+3;

        System.out.println(s7);

        System.out.println("这是个啥");

    }
}
