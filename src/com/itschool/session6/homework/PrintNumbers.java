package com.itschool.session6.homework;

public class PrintNumbers {
    /*Write a Java program to print the numbers from 1 to 10 using a for loop.
     As a next step, modify your program to print only the even numbers from 1 to 10.*/

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        for (int i = 1; i <= 10; i++) {
            if ( i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
