package com.javarush.task.task18.task1810;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileName = console.readLine();
            try(FileInputStream file = new FileInputStream(fileName)) {
                int size = file.available();
                if (size < 1000) {
                    throw new DownloadException();
                }
            }
        }
    }

    public static class DownloadException extends Exception {


    }
}
