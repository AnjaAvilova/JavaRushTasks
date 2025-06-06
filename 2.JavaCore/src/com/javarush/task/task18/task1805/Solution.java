package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try(BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(console.readLine())) {
            TreeSet<Integer> set = new TreeSet<>();
            while (file.available() > 0) {
                int aByte = file.read();
                set.add(aByte);
            }
            for (Integer integer : set) {
                System.out.print(integer+ " ");
            }
        }
    }
}
