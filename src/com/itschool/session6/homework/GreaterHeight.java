package com.itschool.session6.homework;

public class GreaterHeight {

    /*. Write a Java program where you declare two
    integer variables heightOne and heightTwo with any values. Use the ternary
    operator to determine the greater height and assign it to a variable maximumHeight.
    Print the result.*/
    public static void main(String[] args) {

        int heightOne = 165;
        int heightTwo = 180;
        int maximumHeight;

        if (heightOne > heightTwo) {
            maximumHeight = heightOne;
        }else {
            maximumHeight = heightTwo;
        }
        System.out.println("The greater height is: " + maximumHeight);
    }
}
