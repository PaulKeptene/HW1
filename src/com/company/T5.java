package com.company;

import java.util.Scanner;

public class T5 {
    public void task5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ЗАДАНИЕ 5\n" + "Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль");
        System.out.print("Введите аргумент 1:");
        int x = sc.nextInt();
        System.out.print("Введите аргумент 2:");
        int y = sc.nextInt();
        System.out.println("Сумма аргументов:" + (x + y));
        System.out.println("Произведение аргументов:" + (x * y));
    }
}
