package com.company;

public class T2 {
    public void task2(String[] args) {
        System.out.println("ЗАДАНИЕ 2\n" + "Отобразить в окне консоли аргументы командной строки в обратном порядке");
        System.out.print("Аргументы по порядку:");
        for (String arg : args) {
            System.out.print(arg + " ");
        }
        System.out.print("\nАргументы в обратном порядке:");
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(args[i] + " ");
        }
    }
}