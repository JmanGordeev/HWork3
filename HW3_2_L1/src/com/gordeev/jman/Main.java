package com.gordeev.jman;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 5 до 15");
        int n;
        n = sc.nextInt();
        int f = 0;
        int temp = n;
        int factorial;
        for (int i = 1; i < n; i++) {

            f = temp * i;
            factorial = f;
            temp = factorial;

        }
        System.out.println(f);

    }


}

