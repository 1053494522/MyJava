package com.MyJava;

public class Demo01 {
    //有规律的数字计算
  public static String test01(int number){

       int a = number;
       int b = number*10+number;
       int c = number*100+number*10+number;
       int d = number*1000+number*100+number*10+number;
       int e = number*10000+number*1000+number*100+number*10+number;
       int sun =a+b+c+d+e+d+c+b+a;
       String end = a+"+"+b+"+"+c+"+"+d+"+"+e+"+"+d+"+"+c+"+"+b+"+"+a+"="+sun;
       return end;
    }

}
