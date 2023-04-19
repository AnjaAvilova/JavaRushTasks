package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Треугольник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int strong1 = scanner.nextInt();
        int strong2 = scanner.nextInt();
        int strong3 = scanner.nextInt();
        int sum1 = strong2 + strong3;
        int sum2 = strong1 + strong3;
        int sum3 = strong2 + strong1;
        if (strong1 < sum1 && strong2 < sum2 && strong3 <sum3) {
            System.out.println(TRIANGLE_EXISTS);
        }else {
            System.out.println(TRIANGLE_NOT_EXISTS);
        }
    }
}
