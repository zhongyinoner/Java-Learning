package org.example;


public class Main {
    public static void main(String[] args) {
        //JDK10新特性局部变量类型推断
        var i = 10086;
        System.out.println(i);
        var j = 1.5;
        System.out.println(j);
    }
}