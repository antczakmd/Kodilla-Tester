package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;
public class BookManager {
    public static List<Book> bookDirectory = new ArrayList<>();

    public static Book createBook(String title, String author) {
        Book newBook = new Book(title, author);

        for (Book book : bookDirectory) {
            System.out.println("Does it exist? " + book.equals(newBook));
            if (book.equals(newBook)) {
                return book;
            }
        }
        bookDirectory.add(newBook);
        return newBook;
    }
    
}


