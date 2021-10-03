package com.company;

import java.util.Scanner;

public class T3 {
    public void task3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите кол-во случайных чисел для генерации:");
        int num = sc.nextInt();
        System.out.println("Укажите диапазон чисел: \n" + "Min: ");
        int min = sc.nextInt();
        System.out.println("Max: ");
        int max = sc.nextInt();
        System.out.println("Показать числа с переходом на новую строку или нет? (1/YES, 2/NO)");
        int v = sc.nextInt();
        if (v == 1) {
            for (int i = 1; i < num + 1; i++) {
                int n = (int) (Math.random() * (max - min)) + min;
                System.out.println("Число " + i + ":" + n);
            }
        } else if (v == 2) {
            for (int i = 1; i < num + 1; i++) {
                int n = (int) (Math.random() * (max - min)) + min;
                System.out.print("Число " + i + ":" + n + ", ");
            }
        }

    }
}
