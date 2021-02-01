package com.MyJava;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Scanner;

//输出指定路径下的所有文件名
public class Demo17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String rootPath = str;
        System.out.println("目录【"+str+"】中有以下文件");
        File file = new File(rootPath);
        print(0, file);

    }

    public static void print(int n, File file) {

        for (int i = 0; i < n; i++) {
            System.out.print("　　");
        }

        System.out.println(file.getName());

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File subFile : files) {
                print(n + 1, subFile);
            }
        }
    }
}