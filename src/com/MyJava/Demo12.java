package com.MyJava;

import java.util.ArrayList;
import java.util.Scanner;

//判断一个字符串中的"( )"是否配对
public class Demo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList list = new ArrayList();
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '('){
                flag = true;
                list.add("(");
            }else if (ch == ')'){
                for (int j = 0; j < list.size(); j++) {
                    if ("(".equals(list.get(j))){
                        list.remove(j);
                    }
                }
            }
        }
        if (flag){
            if (list.size() == 0){
                System.out.println("您输入的内容，括号完全配对");
            }else {
                System.out.println("您输入的内容，括号不配对");
            }
        }

    }
}
