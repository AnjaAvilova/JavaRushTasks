package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(3.14, "name");
        labels.put(5.5, "five");
        labels.put(1.0, "one");
        labels.put(2.0, "two");
        labels.put(3.0, "three");
    }
    public static void main(String[] args) {
        System.out.println(labels);
    }
}
