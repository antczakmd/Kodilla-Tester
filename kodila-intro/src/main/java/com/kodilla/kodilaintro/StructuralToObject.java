package com.kodilla.kodilaintro;

public class StructuralToObject {
    private String name;
    private double age;
    private double height;

    public StructuralToObject(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public boolean validateAge() {
        if (this.age > 30) {
            return true;
        }
        return false;

    }

    public boolean validateHeight() {
        if (this.height > 160) {
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        StructuralToObject person = new StructuralToObject("Adam", 40.5, 178);
        if (person.validateName()) {
            if (person.validateAge() && person.validateHeight()) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }

    private boolean validateName() {
        if (this.name != null) {
            return true;
        }
        return false;

    }
}









