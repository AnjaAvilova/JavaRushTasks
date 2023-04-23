package com.javarush.task.pro.task04.task0423;

import java.util.Scanner;

/* 
Калибровка климата
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int middleSum = 0;
        int f = 5;

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int number5 = scanner.nextInt();
        for (int i = 0; i < 5; i++) {
            middleSum = (number1 + number2 + number3 + number4 + number5)/f;
        }
        System.out.println(middleSum);
    }



}
