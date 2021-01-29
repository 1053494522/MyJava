package com.MyJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//判断字符串中出现次数最多的字符
public class Demo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)){
                int n = map.get(ch);
                n++;
                map.put(ch,n);
            }else {
                map.put(ch,1);
            }
        }
        int max = -1;
        ArrayList list = new ArrayList();
        for (char ch: map.keySet()){
            int n = map.get(ch);
            if (n > max){
                max = n;
                list.clear();
                list.add(ch);
            }
            if (n == max){
                list.add(ch);
            }

        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (list.contains(ch)){
                continue;
            }
            sb.append(ch);
        }
        System.out.println(sb.toString());
    }
}
