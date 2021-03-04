package com.jvm.test;

/**
 * @author: zxj 2021/03/03 11:09
 **/
public class ClassInitTest {
    private static int num = 1;

    static {
        num = 2;
        number = 20;
    }

    private static int number = 10;

    public static void main(String[] args) {
        System.out.println(ClassInitTest.num);
        System.out.println(ClassInitTest.number);
    }
}
