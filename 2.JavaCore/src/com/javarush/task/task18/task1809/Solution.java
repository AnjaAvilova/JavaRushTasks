package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        try(BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1 = new FileInputStream(console.readLine());
        FileOutputStream file2 = new FileOutputStream(console.readLine()))
        {
            while(file1.available()>0){
               list.add(file1.read());
            }
            Collections.reverse(list);
            for (int i = 0; i < list.size(); i++) {
                file2.write(list.get(i));
            }

        }


    }

}
