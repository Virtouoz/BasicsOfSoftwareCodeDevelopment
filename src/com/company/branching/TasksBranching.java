package com.company.branching;

public class TasksBranching {

    public static boolean task1(double a, double b) {
        if (a + b >= 180) {
            return false;
        } else {
            System.out.println(true);
            if (a == 90 || b == 90 || a + b == 90)
                return true;
            else
                return false;
        }
    }

    public static double task2(double a, double b,
                               double c, double d) {
        return Math.max(Math.min(a, b), Math.min(c, d));
    }

    public static boolean task3(double x1, double y1,
                                double x2, double y2,
                                double x3, double y3) {
        return (x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1);
    }

    public static boolean task4(double A, double B,
                                double x, double y, double z) {
        return (A >= x && B >= y) ||
                (A >= y && B >= x) ||
                (A >= x && B >= z) ||
                (A >= z && B >= x) ||
                (A >= y && B >= z) ||
                (A >= z && B >= y);
    }

    public static double task5(double x) {
        if (x <= 3) {
            return Math.pow(x, 2) - 3 * x + 9;
        } else {
            return 1 / (Math.pow(x, 3) + 6);
        }

    }

}
