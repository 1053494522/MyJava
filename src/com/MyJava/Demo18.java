package com.MyJava;

import java.util.Scanner;

//回文数
public class Demo18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        test.hui(str);
    }
}

class test {
    public static void hui(String str) {
        boolean flag = true;
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) == str.charAt(j)) {
                continue;
            } else {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("字符串" + str + ",是一个回文数");
        } else {
            System.out.println("字符串" + str + ",不是一个回文数");
        }
    }
}