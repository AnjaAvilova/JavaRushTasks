package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        Thread thread1 = new Thread1();
        threads.add(thread1);
        Thread thread2 = new Thread2();
        threads.add(thread2);
        Thread thread3 = new Thread3();
        threads.add(thread3);
        Thread thread4 = new Thread4();
        threads.add(thread4);
        Thread thread5 = new Thread5();
        threads.add(thread5);


    }

    public static void main(String[] args) {


    }

    public static class Thread1 extends Thread {

        public void run() {
            while (true) {
            }
        }
    }

    public static class Thread2 extends Thread {

        public void run() {
            try {
                throw new InterruptedException();
            } catch (Exception e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Thread3 extends Thread {

        public void run() {
            while (true) {
                System.out.println("Ура");
                try {
                    Thread3.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static class Thread4 extends Thread implements Message {

        public void run() {
            while (!isInterrupted()){
            }
        }

        @Override
        public void showWarning() {
            interrupt();
        }
    }

    public static class Thread5 extends Thread {

        public void run() {
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
            while (true) {
                try {
                    String string = console.readLine();
                    if (string.equalsIgnoreCase("N")) {
                        break;
                    }
                    sum = sum + Integer.parseInt(string);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(sum);
        }
    }
}