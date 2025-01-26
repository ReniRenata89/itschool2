package com.itschool.session7.homework;

import java.util.Scanner;

public class StringReverser {
    /* String Reverser
    Ask the user to enter a string. Print the reversed version of this string.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tasteaza sirul: ");
        String string = scanner.next();

        StringBuilder reverse = new StringBuilder();
        reverse.reverse();
        System.out.println("Șirul inversat este: " + reverse.toString());
        /*nu inteleg de ce nu apare sirul inversat*/

    }
}
