package com.company;

import java.util.Scanner;

public class T1 {
    public String task1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввседите имя пошльзователя:");
        String name = sc.nextLine();
        System.out.println("Привет " + name +"!");
        return name;
    }
}
