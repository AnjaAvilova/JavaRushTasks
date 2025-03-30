package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream file = new FileInputStream(console.readLine())) {
            int count = 0;
            while (file.available() > 0) {

                char read = (char) file.read();

                if (read == ',') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
