package com.itschool.session6.homework;

public class Comparare {
    /*Write a Java program to declare two integer variables firstNumber
    and secondNumber with any values. Use an equality operator to compare these
    two numbers and print the result. Do the same for two String objects firstString
    and secondString with the same value, but use the equals() method for comparison.
    Print the result.*/

    public static void main(String[] args) {

        int firstNumber = 10;
        int secondNumer = 14;

        if (firstNumber == secondNumer) {
            System.out.println("The two numbers are equal.");
        }else {
            System.out.println("The two numbers are not equal.");
        }

        String firstString = "Reni";
        String secondString = "Reni";

        if (firstString.equals(secondString)) {
            System.out.println("The two strings are equal.");
        }else {
            System.out.println("The two strings are not equal.");
        }
    }
}