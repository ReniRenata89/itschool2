package com.itschool.session8.homework;

public class ReverseAString {

    /*Description: Use the StringBuilder class to write a program that reverses
    an input string. For example, the input "hello" should return "olleh".*/

    public static void main(String[] args) {
        String string = "Hello";
        StringBuilder reversed = new StringBuilder();

        for (int i = string.length() - 1; i >= 0; i--){
            reversed.append(string.charAt(i));
        }
        System.out.println("Reversed string: " + reversed.toString());



    }
}
