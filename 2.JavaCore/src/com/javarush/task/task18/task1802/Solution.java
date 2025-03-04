package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream file = new FileInputStream(console.readLine())) {

            int min = Integer.MAX_VALUE;
            while (file.available() > 0) {
                int aByte = file.read();
                if (aByte < min) {
                    min = aByte;
                }
            }
            System.out.println(min);
        }
    }

}
