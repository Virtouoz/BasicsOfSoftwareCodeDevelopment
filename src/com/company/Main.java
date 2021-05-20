package com.company;

import com.company.line.project.Tasks;
import com.company.branching.TasksBranching;
import com.company.cycles.TasksCycles;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int x = 3;
        switch (x) {
            case 1 -> {
                System.out.println(Tasks.task1(1, 2, 3));
                System.out.println(Tasks.task2(1, 2, 3));
                System.out.println(Tasks.task3(1, 2));
                System.out.println(Tasks.task4(111.222));
                System.out.println(Tasks.task5(3600));
                System.out.println(Tasks.task6(-3, 1));
            }
            case 2 -> {
                System.out.println(TasksBranching.task1(1, 2));
                System.out.println(TasksBranching.task2(1, 2, 3, 4));
                System.out.println(TasksBranching.task3(1, 2, 2, 4, 4, 8));
                System.out.println(TasksBranching.task4(5, 5, 10, 3, 4));
                System.out.println(TasksBranching.task5(0));
            }
            case 3 -> {
                Scanner scanner = new Scanner(System.in);
                System.out.println(TasksCycles.task1(scanner.nextInt()));
                System.out.println(TasksCycles.task2(0, 4, 0.1));
                System.out.println(TasksCycles.task3());
                System.out.println(TasksCycles.task4());
                System.out.println("!!!");
                System.out.println(TasksCycles.task5(0.5));
                TasksCycles.task6();
                TasksCycles.task7(10, 55);
                TasksCycles.task8(1023567894, 3409211);
            }
        }
    }
}
