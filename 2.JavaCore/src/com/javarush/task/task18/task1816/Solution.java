package com.javarush.task.task18.task1816;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (FileReader reader = new FileReader(args[0])) {
            int count = 0;
            while (reader.ready()) {
                int read = reader.read();
                if (read >= 65 & read <= 122 & Character.isAlphabetic(read)) {
                    count++;
                }

            }
            System.out.println(count);

        }
    }
}
