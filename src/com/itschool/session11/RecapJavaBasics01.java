package com.itschool.session11;

public class RecapJavaBasics01 {
    //Write a program that multiplies two int values and stores the result in an int.
    // What happens if the result is larger than the maximum int value?
    // How can you handle this scenario?

    public static void main(String[] args) {

        int a = Integer.MAX_VALUE;
        int b = 2;
        long result = (long) a * b;
        System.out.println(result);

    }
}
