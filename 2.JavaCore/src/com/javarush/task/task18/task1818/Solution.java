package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             FileOutputStream stream = new FileOutputStream(console.readLine());
             FileInputStream inputStream2 = new FileInputStream(console.readLine());
             FileInputStream inputStream3 = new FileInputStream(console.readLine())) {
            while (inputStream2.available() > 0) {
                stream.write(inputStream2.read());
            }
            while (inputStream3.available() > 0) {
                stream.write(inputStream3.read());
            }
        }
    }
}
