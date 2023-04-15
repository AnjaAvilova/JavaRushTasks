package com.javarush.task.pro.task02.task0211;

/* 
Получение длины строки
*/

public class Solution {

    public static void main(String[] args) {
        String emptyString = "";

        String Str1 = new String(emptyString);
        String Str2 = new String("Gomu Gomu no Bazooka!");
        String Str3 = new String (emptyString + 2 + 2 + "22");

        System.out.println(emptyString);
        System.out.println("Gomu Gomu no Bazooka!");
        System.out.println((emptyString + 2 + 2 + "22"));
    }
}
