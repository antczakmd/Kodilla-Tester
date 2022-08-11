package com.kodilla.kodilaintro;

public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600,1000,2020);
        System.out.println("notebook weight: " + notebook.weight);
        System.out.println("notebook price: " + notebook.price);
        System.out.println("notebook year: " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();


        Notebook heavyNotebook = new Notebook(2000,1500,2010);
        System.out.println("heavyNotebook weight: "+ heavyNotebook.weight);
        System.out.println("heavyNotebook price: "+ heavyNotebook.price);
        System.out.println("heavyNotebook year: " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearAndPrice();

        Notebook oldNotebook = new Notebook(1600,500,2000);
        System.out.println("oldNotebook weight: "+ oldNotebook.weight);
        System.out.println("oldNotebook price: "+ oldNotebook.price);
        System.out.println("oldNotebook year: " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearAndPrice();
    }
}