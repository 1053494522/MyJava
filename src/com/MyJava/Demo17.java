package com.MyJava;

import java.io.File;
import java.util.Scanner;

//输出指定路径下的所有文件名
public class Demo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        File f = new File(str);
        method(f);


    }
    private static void method(File f) {
        if(f.isDirectory()) {
            File[] fs = f.listFiles();
            for (File f1 : fs) {
            System.out.println(f1);
            }
        }
    }
}
