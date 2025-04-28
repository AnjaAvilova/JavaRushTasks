package com.javarush.task.task19.task1920;

import java.io.*;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;



/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader(args[0]))){
            Map<String, Double> map = new TreeMap<>();
            while (reader.ready()){
                String string = reader.readLine();
                String[] strings = string.split(" ");
                String name = strings[0];
                String value = strings[1];
                Double money = Double.valueOf(value);
                if(!map.containsKey(name)) {
                    map.put(name, money);
                } else {
                    Double oldMoney = map.get(name);
                    map.put(name, oldMoney+money);
                }
            }
            Double max = Collections.max(map.values());
            for (Map.Entry<String, Double> entry : map.entrySet()) {
                String key = entry.getKey();
                Double value = entry.getValue();
                if(value.equals(max)){
                    System.out.println(key);
                }
            }
        }

    }
}
