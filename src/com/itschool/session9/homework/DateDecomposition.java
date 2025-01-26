package com.itschool.session9.homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateDecomposition {
    public static void displayDateComponents(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate parsedDate = LocalDate.parse(date, formatter);

        int year = parsedDate.getYear();
        int month = parsedDate.getMonthValue(); // Month is 1-12, not 0-based
        int day = parsedDate.getDayOfMonth();
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }

    public static void main(String[] args) {
        String date = "2025-01-26";
        displayDateComponents(date);
    }
}
