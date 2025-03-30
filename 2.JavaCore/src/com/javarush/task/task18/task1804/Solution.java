package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
//        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
//             FileInputStream stream = new FileInputStream(console.readLine())) {
//            Map<Integer, Integer> map = new HashMap<>();
//            while (stream.available() > 0) {
//                int read = stream.read();
//                if (!map.containsKey(read)) {
//                    map.put(read, 1);
//
//                } else {
//                    Integer value = map.get(read);
//                    map.put(read, value + 1);
//                }
//
//            }
//            int min = Collections.min(map.values());
//            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//                if (entry.getValue().equals(min)) {
//                    System.out.print(entry.getKey() + " ");
//                }
//            }
//        }
        byte[] bytes = Files.readAllBytes(Path.of(new Scanner(System.in).nextLine()));
        Map<Byte, Integer> map = IntStream.range(0, bytes.length)
                .boxed()
                .collect(Collectors.toMap(i -> bytes[i], i -> 1, (oV, nV) -> oV + nV));
        map.entrySet().stream()
                .filter(entry->Objects.equals(entry.getValue(), Collections.min(map.values())))
                .forEach(entry-> System.out.print(entry.getKey() + " "));
    }
}
