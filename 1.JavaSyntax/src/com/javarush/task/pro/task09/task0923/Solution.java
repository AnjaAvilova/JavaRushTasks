package com.javarush.task.pro.task09.task0923;

/* 
Ранг доступа — Пиратский Капитан
*/

import static com.javarush.task.pro.task09.task0923.CaptainBridge.*;

public class Solution {
    public static void main(String[] args) {
        String[] ranks = {"Раб", "Гость", "Боец", "Ветеран", "Картографист", "Капитан", "Стив"};
//        String str = "";
        for (String rank : ranks) {
            boolean access = debugAccess(rank);
            if (access) {
//               /str = rank;
                checkAccess(rank);
                break;
            }

        }

    }
}
