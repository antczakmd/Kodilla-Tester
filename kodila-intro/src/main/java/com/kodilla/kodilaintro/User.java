package com.kodilla.kodilaintro;
import java.util.Random;
public class User {

    public double[] user;

    public double size;
    String name;

    public User(String user, int i) {

    }

    public double User(){
        this.user = new double[6];
        this.size = 0;

                public void add (int value) {
                    if(this.size == 6) {
                        return;
                    }
                    this.user[(int) this.size] = value;
                    this.size++;

        }
        public double averageOfAges () {

            double suma = 0;
            for (double i = 0; i < user.length; i++) {
                suma += user[(int) i];
                System.out.println(suma);
            }
            double average = suma/(size);
            return average;
        }
    }

    int i = 30;
    int max = 5000;
    int min = 30;
    public int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(30);
            sum = sum + temp;
            result++;
        }
        return result;

        if(user[i]>=max){
            System.out.printf("Wartosc max wynosi %d ", user[i]);
        }
        if(user[i]<=min){
            System.out.printf("Wartosc min wynosi %d ", user[i]);
        } // to wszystko w petli ktora losuje liczby
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
    }
}

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




