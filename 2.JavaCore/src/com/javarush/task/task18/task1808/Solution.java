package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = console.readLine();
        String fileName2 = console.readLine();
        String fileName3 = console.readLine();
        try (FileInputStream inputStream1 = new FileInputStream(fileName1);
            FileOutputStream outputStream2  = new FileOutputStream(fileName2);
            FileOutputStream outputStream3 = new FileOutputStream(fileName3)){
            int half = (inputStream1.available()+1)/2;
            int count = 0;
            while (inputStream1.available()>0){
                if(count<half){
                    outputStream2.write(inputStream1.read());
                    count++;
                } else {
                    outputStream3.write(inputStream1.read());
                }
            }
        }

    }
}
