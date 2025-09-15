package com.javarush.task.task13.task1319;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args)throws Exception {
        try(InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(streamReader);
        BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()))){
            while(true){
                String string = reader.readLine();
                writer.write(string);
                writer.newLine();
                if(string.equalsIgnoreCase("exit")){
                    break;
                }
            }
        }


    }
}
