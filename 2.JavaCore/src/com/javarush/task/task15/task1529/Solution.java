package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        try {
            reset();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static CanFly result;

    public static void reset() throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String string = reader.readLine();
            if (string.equalsIgnoreCase("helicopter")) {
                result = new Helicopter();
            } else if (string.equalsIgnoreCase("plane")) {
                String str = reader.readLine();
                int number = Integer.parseInt(str);
                result = new Plane(number);

            }
        }
    }
}
