package com.MyJava;
//数据计算
class Demo06 {
public static void test06(){
    int sum=0;
    for (int i = 0; i < 1000; i++) {
        if (i==48||i==40||i%2==1){
            continue;
        }
        sum += i;
        if (sum >= 25000){
            break;
        }
    }
    System.out.println("0到1000之间(40,48跳过，大于等于25000跳出)偶数的和为：" + sum);
}
}
