package com.company.cycles;

import java.util.Arrays;

public class TasksCycles {

    public static int task1(int a) {
        int sum = 0;
        for (int i = 0; i < a; i++) {
            sum += i;
        }
        return sum;
    }

    public static double task2(double a, double b, double h) {
        double sum = 0;
        for (double i = a; i < b; i += h) {
            if (i > 2) {
                sum += i;
            } else {
                sum -= i;
            }
        }
        return sum;
    }

    public static long task3() {
        long sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static double task4() {
        long sum = 0;
        for (int i = 0; i <= 200; i++) {
            sum *= i * i;
        }
        return sum;
    }

    public static double task5(double e) {
        double sum = 0;
        double a;
        int i = 1;
        do {
            a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            i++;
            if (Math.abs(a) >= e) {
                sum += a;
            }
        } while (Math.abs(a) >= e);
        return sum;
    }

    public static void task6() {
        for (int i = 65; i < 123; i++) {
            System.out.print((char) i);
            System.out.print("-" + i + " ");
        }
        System.out.println();
    }

    public static void task7(int m, int n) {
        for (int i = m; i <= n; i++) {
            System.out.print(i + " = ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println(";");
        }
    }

    public static void task8(int a, int b) {
        int[] arr = new int[10];
        while (a != 0) {
            arr[a % 10]++;
            a /= 10;
        }
        while (b != 0) {
            if (arr[b % 10] != 0)
                System.out.println(b % 10);
            b /= 10;
        }
    }

}
