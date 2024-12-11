package com.itschool.session5.homework;

import java.util.Scanner;

public class IsPositiveOrNegative {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti nr: ");

        int numar = scanner.nextInt();

        boolean x;
        x = false;

        System.out.println("Numar este negatic: " + x);
        x = !x;
        System.out.println("Numar este pozitiv: " + x);






    }
}
