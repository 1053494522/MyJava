package com.MyJava;

import java.util.Scanner;

//判断一个字符串中的"( )"是否配对
public class Demo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int a = 0;
        for (int i = 0; i < str.length(); i++) {
            char b = str.charAt(i);
            if (b == '(') {
                a++;
            } else if (b == ')') {
                a--;
            }
        }
        if (a == 0) {
            System.out.println("您输入的内容，括号完全配对");
        } else {
            System.out.println("您输入的内容，括号不配对");
        }

    }
}
