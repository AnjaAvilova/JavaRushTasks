package com.javarush.task.task13.task1308;

/* 
Эй, ты там живой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Person {
        public static boolean isAlive() {
            return false;
        }
    }

    interface Presentable extends Person {

    }
}