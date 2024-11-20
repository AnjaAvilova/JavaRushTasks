package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        String fileName = console.nextLine();
        try (FileInputStream inputStream = new FileInputStream(fileName);
             InputStreamReader reader = new InputStreamReader(inputStream);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            List<Integer> list = new ArrayList<>();
            while (bufferedReader.ready()) {
                String string = bufferedReader.readLine();
                int number = Integer.parseInt(string);
                list.add(number);
            }

            list.stream()
                    .filter(number -> number % 2 == 0)
                    .sorted()
                    .forEach(System.out::println);


        }
    }
}
