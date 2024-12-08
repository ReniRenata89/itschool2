package com.itschool.session4.homework.ex1;

import java.util.Scanner;

public class AriaDreptunghiului {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti lungimea dreptunghiului: ");
        double lungimea = scanner.nextDouble();

        System.out.println("Introduceti latimea dreptunghiului: ");
        double latimea = scanner.nextDouble();

        double aria = lungimea * latimea;

        System.out.println("Aria este: " + aria);

        scanner.close();
    }
}
