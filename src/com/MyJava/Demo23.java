package com.MyJava;

import java.util.Scanner;
//计算订单金额
public class Demo23 {
    public static void main(String[] args) {

        Item item = new Item();
        String[] ItemCode = new String[]{"C_101", "C_102"};
        String[] ItemName = new String[]{" HUAWEI Mate30 Pro", "XIAOMI 10 Pro"};
        double[] UnitPrice = new double[]{5000.00, 4699.00};
        item.setItemCode(ItemCode);
        item.setItemName(ItemName);
        item.setUnitPrice(UnitPrice);


        Scanner sc = new Scanner(System.in);
        String temp = sc.next();
        String[] ss = temp.split(",");
        String serial = ss[0];
        int number = Integer.parseInt(ss[1]);

        double total = Order.getOrderAmount(serial, number,item);
        System.out.println(total);



    }
}

 class Item {
    String[] ItemCode;
    String[] ItemName;
    double[] UnitPrice;

    public void setItemCode(String[] ItemCode) {
        this.ItemCode = ItemCode;
    }

    public void setItemName(String[] ItemName) {
        this.ItemName = ItemName;
    }

    public void setUnitPrice(double[] UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    public String[] getItemName() {
        System.out.println(ItemName);
        return ItemName;
    }

    public String[] getItemCode() {
        System.out.println(ItemCode);
        return ItemCode;
    }

    public double[] getUnitPrice() {
        System.out.println(UnitPrice);
        return UnitPrice;
    }


}


class Order extends Item  {

    public static double getOrderAmount(String serial, int number,Item item) {
        Item test = item;
        String[] ItemCode = test.ItemCode;
        String[] ItemName = test.ItemName;
        double[] UnitPrice = test.UnitPrice;
        double sum = 0;
        for (int i = 0; i < ItemCode.length; i++) {
            if (ItemCode[i].equals(serial)) {
                sum = number * UnitPrice[i];
            }
        }
        return sum;
    }

}