package com.MyJava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
//日期判断
public class Demo19 {
    public static void main(String[] args) {
     Date date = test01.date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int Days = test01.Days(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONDAY)+1,calendar.get(Calendar.DATE));
        System.out.printf("此日期为此年的第"+Days+"天");
    }
}

class test01 {
    public static Date date(){
        Scanner scanner = new Scanner(System.in);
        Date date = null;

        DateFormat s = new SimpleDateFormat("yyyy/MM/dd");
        boolean b = true;
        while (b){
            String str = scanner.next();
            try {

                s.setLenient(false);

               date = s.parse(str);
               b = false;
           } catch (Exception e) {
               System.out.println("输入错误，请重新输入：");
         }
        }

        return date;
    }
    public static int Days(int year, int month, int day) {
        int num = 0;
        for (int i = 1; i < month; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    num += 31;
                    break;
                case 2:
                    num += (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 29 : 28;
                    break;
                default:
                    num += 30;
                    break;
            }
        }
        num += day;
        return num;
    }
}
