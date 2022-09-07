package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {

        BookManager.createBook("Really?", "Jeremy Clarkson");
        BookManager.createBook("The Top Gear Years","Jeremy Clarkson");
        BookManager.createBook("The Top Gear Years","Jeremy Clarkson");


        System.out.println("All tokens: " + BookManager.bookDirectory);
        System.out.println("Directory size: " + BookManager.bookDirectory.size());


        }
    }

