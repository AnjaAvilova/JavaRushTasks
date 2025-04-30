package com.javarush.task.task19.task1920;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;



/* 
Самый богатый
*/

public class Solution {
    public static void main1(String[] args) throws IOException {
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

    public static void main(String[] args) throws IOException {
        List<String> list = Files.readAllLines(Path.of(args[0]));
        TreeMap<String, Double> map = list.stream()
                .collect(Collectors.toMap(
                        str -> str.split("\\s")[0],//сформировали ключи 20-22 стр и сразу положили в map 29 cтр
                        str -> Double.parseDouble(str.split("\\s")[1]),//из строки получили value положили в массив и распарсили
                        (oldValue, newValue) -> oldValue + newValue,//28.29 стр
                        () -> new TreeMap<>()//упаковали в тримэп

                ));
        map.entrySet().stream()//33-35 стр
                .filter(entry->entry.getValue().equals(Collections.max(map.values())))//36 стр
                .forEach(entry-> System.out.println(entry.getKey()));//вывод



    }
}
