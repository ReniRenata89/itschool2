package com.itschool.session5.homework;

import java.util.Scanner;

public class IsPositiveOrNegative {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti nr: ");

        int numar = scanner.nextInt();

        boolean x = numar <= 0;

        System.out.println("Numarul este negatic: " + x);

        System.out.println("Numarul este pozitiv: " + !x);

    }
}
