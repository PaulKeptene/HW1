package com.company;

import java.util.Scanner;

public class T3 {
    public void task3() {
        System.out.println("ЗАДАНИЕ 3\n"+"Вывести заданное количество случайных чисел с переходом и без перехода на новую строку");
        Scanner sc = new Scanner(System.in);
        System.out.print("Укажите кол-во случайных чисел для генерации:");
        int num = sc.nextInt();
        System.out.print("Укажите диапазон чисел: \n" + "Min: ");
        int min = sc.nextInt();
        System.out.print("Max: ");
        int max = sc.nextInt();
        System.out.print("Показать числа с переходом на новую строку или нет? (1/YES, 2/NO):");
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
