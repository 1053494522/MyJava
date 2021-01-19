package com.MyJava;
//取得最大值

public class Demo04 {
    public static void main(String[] args) {
        System.out.println("6, 12的最大值为：" + Demo.Max(6, 12));
        System.out.println("6, 12, 10的最大值为：" + Demo.Max(6, 12, 10));
        System.out.println("19.35, 28.99, 65.99的最大值为：" + Demo.Max(19.35, 28.99, 65.99));
        System.out.println("9.58, 18.65的最大值为：" + Demo.Max(9.58, 18.65));
    }
}

class Demo {
    public static int Max(int a, int b) {
        int max = a > b ? a : b;
        return max;
    }

    public static int Max(int a, int b, int c) {
        int se = a > b ? a : b;
        int max = se > c ? se : c;
        return max;
    }

    public static double Max(double a, double b) {
        double max = a > b ? a : b;
        return max;
    }

    public static double Max(double a, double b, double c) {
        double se = a > b ? a : b;
        double max = se > c ? se : c;
        return max;
    }

}