package com.jvm.test;

/**
 * @author: zxj 2021/03/03 13:50
 **/
public class ClinitTest {

    private int a = 1;
    private static int c = 3;
    public static void main(String[] args) {
        int b = 2;
    }

    public ClinitTest() {
        a = 20;
        int d = 20;
    }
}
