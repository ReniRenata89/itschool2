package com.itschool.session10.homework;

import java.util.ArrayList;

public class ChristmasWishlist {
    public static void main(String[] args) {
        ArrayList<String> wishlist = new ArrayList<>();

        wishlist.add("blouse");
        wishlist.add("dog");
        wishlist.add("computer");
        System.out.println("Christmas Wishlist:");

        for (String item : wishlist) {
            System.out.println(item);
        }
    }
}
