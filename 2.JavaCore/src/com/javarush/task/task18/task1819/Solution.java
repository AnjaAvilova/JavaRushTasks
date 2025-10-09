package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String file1 = console.readLine();
        String file2 = console.readLine();
        List<Integer> list = new ArrayList<>();
        try (FileInputStream stream1 = new FileInputStream(file1);
             FileInputStream stream2 = new FileInputStream(file2)) {
            while (stream2.available() > 0) {
                list.add(stream2.read());
            }

            while (stream1.available() > 0) {
                list.add(stream1.read());
            }
        }
        try (FileOutputStream outputStream = new FileOutputStream(file1)) {
            for (Integer aByte : list) {
                outputStream.write(aByte);
            }
        }
    }
}
