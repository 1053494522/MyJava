package com.MyJava;

import java.util.HashMap;
import java.util.Scanner;

//模拟用户登录
public class Demo16 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("admin","admin@123");
        map.put("guess","123456");
        map.put("my","my_666");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账号:");
        String user = sc.next();
        System.out.println("请输入密码:");
        String password = sc.next();
        if (map.containsKey(user)){
            if (password.equals(map.get(user))){
                System.out.println("登录成功");
            }else{
                System.out.println("您输入的账号或密码不正确");
            }
        }else{
            System.out.println("您输入的账号或密码不正确");
        }

    }
}
