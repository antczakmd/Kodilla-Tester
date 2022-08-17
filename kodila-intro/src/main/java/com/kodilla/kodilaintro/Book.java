package com.kodilla.kodilaintro;

public class Book {
    private String author;
    String getAuthor(){
            return this.author;
        }
        void setAuthor(String author){
            this.author = author;
        }
    private String title;
    String getTitle(){
            return this.title;
        }
        void setTitle(String title){
            this.title = title;
            }

    public Book (String author, String title) {
        this.author = author;
        this.title = title;
    }
    public static Book of(String author, String title){
        return new Book(author, title);


    }

}







//public class Book {
//
//    private String author;
//        String getAuthor(){
//            return this.author;
//        }
//        void setAuthor(String author){
//            this.author = author;
//        }
//    private String title;
//        String getTitle(){
//            return this.title;
//        }
//        void setTitle(String title){
//            this.title = title;
//        }
//        Book of (String author,String title) {
//        Book book = book.of("Isaac Asimov", "The Galaxy");
//        return book;



