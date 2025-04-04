package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try(BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(console.readLine())) {
            int max = Integer.MIN_VALUE;
            while (file.available() > 0) {
                int maxByte = file.read();
                if (maxByte > max) {
                    max = maxByte;
                }
            }
            System.out.println(max);
        }
    }
}
