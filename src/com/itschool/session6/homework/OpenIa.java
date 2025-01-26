package com.itschool.session6.homework;

public class OpenIa {

    /* Write a Java program where you create two String
    objects named stringOne and stringTwo with the same value "OpenAI".
     */

    public static void main(String[] args) {

        String stringOne = "OpenAI";
        String stringTwo = "OpenAI";

        System.out.println("stringOne:" + stringTwo);
        System.out.println("stringTwo:" + stringOne);

        if (stringOne == stringTwo) {
            System.out.println("The same object");
        }else {
            System.out.println("Different objects");
        }
        if (stringOne.equals(stringTwo)) {
            System.out.println("The same value");
        }else {
            System.out.println("Different values");
        }
    }
}