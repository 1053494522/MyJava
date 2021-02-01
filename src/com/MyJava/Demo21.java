package com.MyJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//判断IP地址是否合法
public class Demo21 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\white_list.txt"));
        String line = null;
        ArrayList<String> list = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            list.add(line);
        }
        bufferedReader.close();
        Scanner scanner = new Scanner(System.in);
        String IP = scanner.next();
        boolean f = true;
        for (String ip : list) {
            if (ip.equals(IP)) {
                f = false;
                System.out.println("该IP地址可以访问网络");
            }
        }
        if (f) {
            System.out.println("该IP地址不可以访问网络");
        }
    }
}
