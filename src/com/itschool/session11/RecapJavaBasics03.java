package com.itschool.session11;

public class RecapJavaBasics03 {

    /*Declare two int variables and perform arithmetic operations on them,
    such as addition, subtraction, multiplication, and division. Print out the
    results of each operation to verify that they were calculated correctly.*/

    public static void main(String[] args) {

        int num1 = 11;
        int num2 = 5;

        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        double division = (double) num1 / num2;

        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
    }
}