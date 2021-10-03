package com.company;

import java.util.Scanner;

public class T4 {
    public void task4() {
        System.out.println("ЗАДАНИЕ 4\n"+"Ввести пароль из командной строки и сравнить его со строкой-образцом");
        String exmpl = "Qwerty1234";
        Scanner sc = new Scanner(System.in);
        System.out.print("Пароль образец для сравнения "+exmpl+"\nВведите свой пароль:");
        String pass = sc.nextLine();
        System.out.println(exmpl.equals(pass));
    }
}
