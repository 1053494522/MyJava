package com.MyJava;
//数组元素交换
public class Demo22 { public static void main(String[] args) {
    int[] arr = {3, 1, 9, 8, 0, 4, 6, 7};
    arr = swap(arr);
    for (int num : arr) {
        System.out.print(num + " ");
    }
}

    public static int[] swap(int[] arr) {
        int max = arr[0];
        int maxIndex = 0;
        int min = arr[0];
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        int temp;
        temp = arr[0];
        arr[0] = max;
        arr[maxIndex] = temp;
        temp = arr[arr.length - 1];
        arr[arr.length - 1] = min;
        arr[minIndex] = temp;
        return arr;
    }
}