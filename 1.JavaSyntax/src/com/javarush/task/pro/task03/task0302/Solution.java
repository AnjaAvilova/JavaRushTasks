package com.javarush.task.pro.task03.task0302;

import java.util.Scanner;

/* 
Призывная кампания
*/

public class Solution {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int ege = scanner.nextInt();
        if(ege<=28 && ege >= 18) {
            System.out.println(name +  ", явитесь в военкомат");

        }

    }
}
