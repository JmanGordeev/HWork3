package com.gordeev.jman;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stringCount;
        System.out.println("введите число полос");
        stringCount = sc.nextInt();

        for (int i = 1; i <= stringCount; i++) {
            System.out.println("***+++***+++***+++***");
        }

    }
}
