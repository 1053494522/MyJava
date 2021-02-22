package com.MyJava;

public class  A {
    public String toString() {
        return "A";
    }
}
 class B extends A {
    public String toString() {
        return "B";
    }
    public static void main(String[] args) {
        A b=new B();
        System.out.println(b.toString());
    }
}