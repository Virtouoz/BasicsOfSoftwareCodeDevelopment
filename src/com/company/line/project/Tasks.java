package com.company.line.project;

public class Tasks {

    public static double task1(double a, double b, double c) {
        return ((a - 3) * b / 2) + c;
    }

    public static double task2(double a, double b, double c) {
        return (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a)
                - a * a * a * c + Math.pow(b, -2);
    }

    public static double task3(double x, double y) {
        return (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))
                * Math.tan(x * y);
    }

    public static double task4(double R) {
        int integerPart;
        int fractionalPart;
        double newR;
        String[] a = String.valueOf(R).split("[.]");
        integerPart = Integer.parseInt(a[0]);
        fractionalPart = Integer.parseInt(a[1]);
        newR = fractionalPart;
        newR += (double) integerPart / 1000;
        return newR;
    }

    public static String task5(int T) {
        String str;
        int hour;
        int minute;
        int second;
        hour = T / 3600;
        T = T % 3600;
        minute = T / 60;
        T = T % 60;
        second = T;
        str = hour + "ч "
                + minute + "мин "
                + second + "с";
        return str;
    }

    public static boolean task6(double x, double y) {
        if (x >= -2 && x <= 2 && y >= 0 && y <= 4) {
            return true;
        } else if (x >= -4 && x <= 4 && y >= -3 && y <= 0) {
            return true;
        } else {
            return false;
        }
    }

}
