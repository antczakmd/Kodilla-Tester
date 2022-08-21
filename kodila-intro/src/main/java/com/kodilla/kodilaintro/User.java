package com.kodilla.kodilaintro;

public class User {
    public int age;
    String name;
    public User(String name, int age) {
        this.name = name;
        this.age = age;

    }
 }
class Imiona {

    public static void main(String[] args) {
        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);

        User[] users = new User[6];
        users[0] = anna;
        users[1] = betty;
        users[2] = carl;
        users[3] = david;
        users[4] = eva;
        users[5] = frankie;

        int sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum = sum + users[i].age;


        }
        int average = sum / users.length;
        for (int i = 0; i < users.length; i++) {
            if (users[i].age <= average) {
                System.out.println(users[i].name);
            }
        }
    }
}
// do tad

//2. Utwórz klasę RandomNumbers, w której będzie istnieć metoda losująca liczby z zakresu 0-30,
// tak długo, aż ich suma przekroczy 5000.
// Napisz dwie metody zwracające największą i najmniejszą wylosowaną wartość.





//class User {
//        public User(String imie, int wiek) {
//        this.imie = imie;
//        this.wiek = wiek;
//        System.out.println("Konstruktor klasy User");
//
//
//    }
//    String imie;
//    int wiek;




