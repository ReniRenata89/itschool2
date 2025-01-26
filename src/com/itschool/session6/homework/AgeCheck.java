package com.itschool.session6.homework;

import java.util.Scanner;

public class AgeCheck {
    /*Write a Java program that declares an integer variable age with a
    value that can be inserted from keyboard. Print a statement saying
    "I am adult" if age is 18 or more, else print
    "I am a child", using the ternary operator.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("I am adult");
        }else {
            System.out.println("I am child");
        }
    }
}
