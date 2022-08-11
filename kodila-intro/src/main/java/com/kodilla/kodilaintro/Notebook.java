package com.kodilla.kodilaintro;

public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price <= 500) {
            System.out.println("This notebook is very cheap.");
        } else if ((this.price >= 600) && (this.price <= 1000)) {
            System.out.println("The price is good.");
        }
        if (this.price > 1000) {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight <= 500) {
            System.out.println("Device is light.");
        } else if ((this.weight >= 600) && (this.weight <= 1500)) {
            System.out.println("Device isn't to heavy.");
        }
        if (this.weight > 1000) {
            System.out.println("Device is very heavy.");
        }
    }

    public void checkYearAndPrice() {
        if ((this.price < 1200) && (this.year > 2018)) {
            System.out.println("Good deal");
        }
         if ((this.price < 800) && (this.year > 2018)) {
            System.out.println("Scam! Warning!");
        }else if ((this.price <= 500 ) && (this.year >= 2010)) {
             System.out.println("Something dodgy here!");

            }
        }
    }



