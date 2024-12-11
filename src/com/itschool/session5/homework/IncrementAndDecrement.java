package com.itschool.session5.homework;

import java.util.Scanner;

public class IncrementAndDecrement {

    public static void main(String[] args) {

        long numar = 1;

        System.out.println("Initial: " + numar);

        ++numar;
        System.out.println("Incrementare: " +numar);

        --numar;
        System.out.println("Decrementare: " + numar);

        numar++;
        System.out.println("Pre-incrementare: " + numar);

        numar--;
        System.out.println("Pre-decrementare: " + numar);

    }
}
