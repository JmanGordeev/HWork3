package com.gordeev.jman;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height");
        int h = sc.nextInt();
        int count = 1;
        int count2 = h - 1;

        for (int i = 0; i <= count; i++) {

            System.out.print("*");

            if (i == 0 || i == count && count < h) {
                System.out.println();
                count++;
                count2--;
                i = 0;
            }
            if (i == count && count2 == 0 && count >= h) {
                System.out.println();
                count--;
                h--;
                i = 0;

            }
        }
    }
}
