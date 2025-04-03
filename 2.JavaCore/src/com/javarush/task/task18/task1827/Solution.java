package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       try(BufferedReader console = new BufferedReader(new InputStreamReader(System.in))
       ) {
           String fileName = console.readLine();
           if (args == null || args.length == 0) {
               return;
           }
           try(FileReader reader = new FileReader(fileName);
           BufferedReader bufferedReader = new BufferedReader(reader)) {
               int max = 0;
               while (bufferedReader.ready()) {

                   String string = bufferedReader.readLine();
                   String id = string.substring(0, 8).trim();
                   int index = Integer.parseInt(id);
                   if (index > max) {
                       max = index;
                   }
               }
               max++;
               try (FileWriter writer = new FileWriter(fileName, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
                   if (args[0].equals("-c")) {
                       String id = checkLength(String.valueOf(max), 8);
                       String productName = checkLength(args[1], 30);
                       String price = checkLength(args[2], 8);
                       String quantity = checkLength(args[3], 4);
                       bufferedWriter.newLine();
                       bufferedWriter.write(id + productName + price + quantity);
                   }
               }
           }
       }
    }

    public static String checkLength(String string, int limit) {
        if (string.length() > limit) {
            return string.substring(0, limit);
        } else {
            StringBuilder stringBuilder = new StringBuilder(string);
            while (stringBuilder.length() != limit) {
                stringBuilder.append(" ");
            }
            return stringBuilder.toString();
        }
    }
}
