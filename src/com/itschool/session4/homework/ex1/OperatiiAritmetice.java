package com.itschool.session4.homework.ex1;

import java.util.Scanner;

public class OperatiiAritmetice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti primul numar: ");
        double nr1 = scanner.nextDouble();

        System.out.println("Introduceti al doile numar: ");
        double nr2 = scanner.nextDouble();

        double adunare = nr1 + nr2;
        double scadere = nr1 - nr2;
        double inmultire = nr1 * nr2;
        double impartire = nr1 / nr2;
        double iRest = nr1 % nr2;

        System.out.println("Rezultate: ");
        System.out.println("Adunare: " + adunare);
        System.out.println("Scadere: " + scadere);
        System.out.println("Inmultire: " + inmultire);
        System.out.println("Impartire: " + impartire);
        System.out.println("Irest: " + iRest);



    }
}
