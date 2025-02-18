package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        List<String> strings1 = Files.readAllLines(Paths.get(fileName1));
        allLines.addAll(strings1);
        List<String> strings2 = Files.readAllLines(Paths.get(fileName2));
        forRemoveLines.addAll(strings2);

        Solution solution = new Solution();
        solution.joinData();
    }


        public void joinData() throws CorruptedDataException {
        HashSet<String> set = new HashSet<>(allLines);
        if(set.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
