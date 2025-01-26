package com.itschool.session9.homework;

import java.time.LocalDate;

public class DisplayTodaysDate {
    /*1. Displaying Today's Date
Description: Write a method named displayTodaysDate that, when called,
prints the current date to the console.
Expected Output: Today's date in the format YYYY-MM-DD.*/

    public static void displayTodaysDate () {
        LocalDate today = LocalDate.now();
        System.out.println(today);
    }

    public static void main(String[] args) {
        displayTodaysDate();
    }
}
