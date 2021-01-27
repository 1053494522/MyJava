package com.MyJava;

import java.util.Scanner;
//数据异常处理
public class Demo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] number = str.split(",");
        int number1 = Integer.parseInt(number[0]);
        int number2 = Integer.parseInt(number[1]);
        try {
            int answer = number1/number2;
            System.out.println(answer);
        }catch (Exception e){
            System.out.println("输入数据有误");
        }
    }

}
