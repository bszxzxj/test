package com.jvm.test;



/**
 * @author: zxj 2021/03/03 14:24
 **/
public class ClinitTest1 {
    static class Father{
        public static int A = 1;
        static {
            A = 2;
        }
    }

    static class Son extends Father{
        public static int B = A;
    }

    public static void main(String[] args) {
        // 先加载Father类，再加载Son类
        System.out.println(Son.B);
    }
}
