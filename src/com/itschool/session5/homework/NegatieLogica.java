package com.itschool.session5.homework;

import java.util.Scanner;

public class NegatieLogica {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti prima valoare (True || Fals): ");

        boolean primul = scanner.nextBoolean();

        System.out.println("Introduceti a doua valoare (True || Fals): ");

        boolean alDoilea = scanner.nextBoolean();

        System.out.println("Negatia primei falori: " + !primul);
        System.out.println("Negatia celei de-a doilea valori: " + !alDoilea);
    }
}
