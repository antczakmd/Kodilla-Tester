package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {

        BookManager.createBook("Really?", "Jeremy Clarkson");
        Book bookOne = new Book("The Top Gear Years","Jeremy Clarkson");
        BookManager.bookDirectory.add(bookOne);
        Book bookTwo = new Book("The Top Gear Years","Jeremy Clarkson");
        BookManager.bookDirectory.add(bookTwo);

        System.out.println("All tokens: " + BookManager.bookDirectory);
        System.out.println("Directory size: " + BookManager.bookDirectory.size());

        System.out.println("Do they have same values?");
        System.out.println(bookOne.equals(bookTwo));
        if (bookOne.equals(bookTwo)) {
            System.out.println("Is it the same book?");
            System.out.println(bookOne == bookTwo);
        }
    }
}
