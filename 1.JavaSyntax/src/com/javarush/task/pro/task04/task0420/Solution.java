package com.javarush.task.pro.task04.task0420;

import java.util.Random;
import java.util.Scanner;

/* 
Страшное число
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println("Введите предполагаемое число");

        checkNumber(new Random().nextInt(10));
    }
    public static void checkNumber(int number) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            int inputNumber = scanner.nextInt();
            if(inputNumber == number) {
                System.out.println("Загадочное число равно " + number);
                break;
            } else {
                System.out.println("Попробуй еще раз");
            }
        }
    }
}
