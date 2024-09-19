package com.javarush.task.pro.task15.task1506;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main (String[] args) throws IOException {
        InputStream stream = System.in;
        Scanner scanner = new Scanner(stream);
        List<String> strings = Files.readAllLines(Path.of(scanner.nextLine()));
        for (int i = 0; i < strings.size(); i++) {
            String str = strings.get(i);
            String string = str.replaceAll("[ .,]", "");
            System.out.println(string);
        }
    }
}

