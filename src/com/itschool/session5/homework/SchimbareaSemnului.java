package com.itschool.session5.homework;

import java.util.Scanner;

public class SchimbareaSemnului {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti numarul: " + scanner);

        int numar = scanner.nextInt();
        int numarSchimbat = -numar;

        System.out.println("Semnul numarului schimbat: " + numarSchimbat);




    }




}
