package com.MyJava;
//高考成绩判读
public class Demo07 {
    public static void main(String[] args) {
        int mps =451;
        int performance = 369;
        String result = performance>=mps ? "通过一本录取分数线":"未通过一本录取分数线";
        System.out.println("您的高考总分:"+performance);
        System.out.println("第一批本科录取分数线:"+mps);
        System.out.println("高考结果:"+result);

    }
}
