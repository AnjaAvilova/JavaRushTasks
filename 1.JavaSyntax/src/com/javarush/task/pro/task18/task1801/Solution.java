package com.javarush.task.pro.task18.task1801;

import java.util.ArrayList;

/* 
Две реализации одного интерфейса
*/

public class Solution {
    public static ArrayList<Runnable> list = new ArrayList<>();

    public static void main(String[] args) {
        addToList(new Car());
        addToList(new Plane());

        runList();
    }

    public static void addToList(Runnable runnable) {
        list.add(runnable);
    }

    public static void runList() {
        for (int i = 0; i < list.size(); i++) {
            Runnable runnable = list.get(i);
            runnable.run();
        }
    }
}