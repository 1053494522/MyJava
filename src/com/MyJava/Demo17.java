package com.MyJava;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Scanner;

//输出指定路径下的所有文件名
public class Demo17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        File file = new File(str);
        File[] files= file.listFiles();
        if (files != null){
            for (File f : files){
                System.out.println(f.getAbsolutePath());
            }
        }
    }
}
