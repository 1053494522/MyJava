package com.MyJava;

import java.util.Scanner;

//数组元素交换
public class Demo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arrStr = str.split(",");
        int[] arr = new int[arrStr.length];
        for (int i = 0,j=9; i < 10; i++,j--) {
            arr[i] = Integer.parseInt(arrStr[j]);
            arr[j] = Integer.parseInt(arrStr[i]);
        }
        for (int i = 0; i < 10; i++) {
            if (i != 9){
                System.out.print(arr[i]+",");
            }else {
                System.out.print(arr[i]);
            }
        }

    }
}
