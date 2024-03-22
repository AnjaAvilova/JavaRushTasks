package com.javarush.task.pro.task16.task1601;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* 
Лишь бы не в понедельник :)
*/

public class Solution {

    static Date birthDate = new Date(124, Calendar.MARCH, 21);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        int day = date.getDay();
        String str = "";
        if (day == 0) {
            str = "Воскресенье";
        } else if (day == 1) {
            str = "Понедельник";
        } else if (day == 2) {
            str = "Вторник";
        } else if (day == 3) {
            str = "Среда";
        } else if (day == 4) {
            str = "Четверг";
        } else if (day == 5) {
            str = "Пятница";
        } else if (day == 6) {
            str = "Суббота";
        }

        return str;
    }
}
