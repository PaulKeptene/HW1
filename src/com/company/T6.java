package com.company;

import java.util.Scanner;

public class T6 {
    public void task6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ЗАДАНИЕ 6\n" + "Ввести с консоли n целых чисел. На консоль вывести числовые значения согласно заданным условиям");
        System.out.print("Укажите кол-во вводимых чисел:");
        int n = sc.nextInt();
        int[] m = new int[n];
        System.out.println("Вводите числа:");
        for (int i = 0; i < n; i++) {
            System.out.print("Число " + (i + 1) + ":");
            m[i] = sc.nextInt();
        }
        System.out.print("Четные числа:");
        for (int i = 0; i < n; i++) {
            if (m[i] % 2 == 0) {
                System.out.print(m[i] + " ");
            }
        }
        System.out.print("\nНе четные числа:");
        for (int i = 0; i < n; i++) {
            if (m[i] % 2 != 0) {
                System.out.print(m[i] + " ");
            }
        }
        int min = m[0], max = m[0];
        for (int i = 0; i < n; i++) {
            if (m[i] < min) {
                min = m[i];
            }
            if (m[i] > max) {
                max = m[i];
            }
        }
        System.out.println("\nМинимальное число:" + min + "\nМаксимальное число:" + max);
        System.out.print("Числа, которые делятся на 3 или на 9:");
        for (int i = 0; i < n; i++) {
            if ((m[i] % 3 == 0) | (m[i] % 9 == 0)) {
                System.out.print(m[i] + " ");
            }
        }
        System.out.print("\nЧисла, которые делятся на 5 или на 7:");
        for (int i = 0; i < n; i++) {
            if ((m[i] % 5 == 0) | (m[i] % 7 == 0)) {
                System.out.print(m[i] + " ");
            }
        }
    }
}

