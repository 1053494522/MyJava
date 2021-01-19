package com.MyJava;

import java.util.Random;

public class Demo03 {
    //生成验证码
    public static String test03(String a){
        if (a.equals("GET")){
            String str = "0123456789";
            StringBuilder sb = new StringBuilder(6);
            for (int i = 0; i < 6; i++) {
                char ch = str.charAt(new Random().nextInt(str.length()));
                sb.append(ch);
            }
            return sb.toString();
        }else {
            return null;
        }

    }
}
