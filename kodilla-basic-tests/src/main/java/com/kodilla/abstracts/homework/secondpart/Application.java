package com.kodilla.abstracts.homework.secondpart;

public class Application {
    public static void main(String[] args) {

       Policeman policeman = new Policeman();
       Person tom = new Person(38,"Tom", policeman);
        tom.printResponsibilities();
    }
}
