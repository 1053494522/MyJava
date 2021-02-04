package com.MyJava;

import java.util.Scanner;

public class Demo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.next();
        String[] ss = temp.split(",");
        String serial = ss[0];
        int number = Integer.parseInt(ss[1]);

        double total = Order.getOrderAmount(serial, number);
        System.out.println(total);
    }
}

class Item {

    String[] ItemCode = new String[]{"C_101", "C_102"};
    String[] ItemName = new String[]{" HUAWEI Mate30 Pro", "XIAOMI 10 Pro"};
    double[] UnitPrice = new double[]{5000.00, 4699.00};
}


class Order extends Item {

    public static double getOrderAmount(String a, int b) {
        Item test = new Item();
        String[] ItemCode = test.ItemCode;
        String[] ItemName = test.ItemName;
        double[] UnitPrice = test.UnitPrice;
        double sum = 0;
        for (int i = 0; i < ItemCode.length; i++) {
            if (ItemCode[i].equals(a)) {
                sum = b * UnitPrice[i];
            }
        }
        return sum;
    }

}