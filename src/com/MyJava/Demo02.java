package com.MyJava;

import java.util.ArrayList;
import java.util.HashMap;

//数组中只出现一次的数字
public class Demo02 {
    public static void main(String[] args) {
        int[] arr = {2,8,6,2,7,3,9,2,8,6,7,9,1};
        HashMap<Integer,Integer>map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            if (map.containsKey(n)){
                int a = map.get(n);
                a++;
                map.put(n,a);
            }else {
                map.put(n,1);
            }
        }
        ArrayList<Integer> list = new ArrayList();
        for (int n:map.keySet()){
            int a = map.get(n);
            if (a == 1){
                list.add(n);
            }
        }
        System.out.print("只出现一次的数字:");
        for (Integer n:list){
            System.out.print(n+",");
        }
    }
}
