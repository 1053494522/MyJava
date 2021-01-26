package com.MyJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//日期格式化
public class Demo10 {
    public static void main(String[] args) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        try{
            Date data = simpleDateFormat.parse("2020年12月10日 10:30:00");
            calendar.setTime(data);
        }catch (ParseException e){
            e.printStackTrace();
        }

        String timeStr = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(calendar.getTime());
        System.out.println(timeStr);
    }
}