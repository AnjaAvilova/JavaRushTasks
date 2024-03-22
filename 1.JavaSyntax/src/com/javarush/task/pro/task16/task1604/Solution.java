package com.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
День недели рождения твоего
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(124,05,9);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        String str = "";
        if(day == 1) {
            str = "Воскресенье";
        } else if (day ==2) {
            str = "Понедельник";
        } else if (day ==3) {
            str = "Вторник";
        } else if (day ==4) {
            str = "Среда";
        } else if (day ==5) {
            str = "Четверг";
        } else if (day ==6) {
            str = "Пятница";
        } else if (day ==7) {
            str = "Суббота";
        }

        return str;
    }
}
