package com.MyJava;


import java.util.Scanner;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Demo20 {
    //判断单词在文中出现的次数
    public static void main(String[] args) throws Exception {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("C:\\Users\\Administrator\\Desktop\\demo.txt"));
        char[] c = new char[1024];
        int l;
        StringBuilder stringBuilder = new StringBuilder();
        while ((l = inputStreamReader.read(c)) != -1) {
            stringBuilder.append(c);
        }
        inputStreamReader.close();
        String text = stringBuilder.toString();
        Scanner scanner = new Scanner(System.in);
        System.out.print("命令行输入:");
        String str = scanner.next();
        String replaceText = text.replace(str, "");
        int count = (text.length() - replaceText.length()) / str.length();
        System.out.println("命令行输出："+str+"在文件中出现了"+count+"次");
    }
}
