package com.company;

import java.util.Scanner;

public class T1 {
    public String task1() {
        System.out.println("ЗАДАНИЕ 1\n"+"Приветствовать любого пользователя при вводе его имени через командную строку");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ввседите имя пользователя:");
        String name = sc.nextLine();
        System.out.println("Привет " + name +"!");
        return name;
    }
}
