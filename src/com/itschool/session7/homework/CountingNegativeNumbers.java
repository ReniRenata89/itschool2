package com.itschool.session7.homework;

public class CountingNegativeNumbers {

    /*Counting Negative Numbers
Given an array of integers, write a program to count
and print the number of negative integers in the array.*/

    public static void main(String[] args) {
        int num1 = -3;
        int num2 = -7;
        int num3 = 8;
        int num4 = 32;
        int num5 = -14;

        switch (num1) {
            case 3:
                System.out.println(num1 + "is negative");
                break;
            default:
        }
        switch (num2) {
            case -7:
                System.out.println(num2 + "is negative");
                break;
            default:
        }
        switch (num3) {
            default:
                if (num3 < 0){
                    System.out.println(num3 + "is negative");
                }
        }
        switch (num4) {
            default:
                if (num4 < 0){
                    System.out.println(num4 + " is negative");
                }
        }
        switch (num5) {
            case -14:
                System.out.println(num5 + "is negative");
                break;
            default:
        }
    }
}
