package com.MyJava;

import java.math.BigInteger;
//人口数量
public class Demo08 {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("7100000000");
        BigInteger b = new BigInteger("1400000000");
        System.out.println("2019年世界人口总数约："+a);
        System.out.println("2019年中国人口总数约："+b);
    }
}