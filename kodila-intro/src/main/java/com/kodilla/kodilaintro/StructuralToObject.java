//package com.kodilla.kodilaintro;
//
//public class StructuralToObject {
//    private static String name;
//    private static double age;
//    private static double height;
//
//    public StructuralToObject(String name, double age, double height) {
//        this.name = name;
//        this.age = age;
//        this.height = height;
//    }
//
//    public void validateAge() {
//        if (this.age > 30) {
//            System.out.println("User is older than 30 years old.");
//        } else {
//            System.out.println("User is younger than 30 years old.");
//        }
//    }
//
//    public void validateHeight() {
//        if (this.height > 160) {
//            System.out.println("User is tall.");
//        } else {
//            System.out.println("User isn't tall at all.");
//        }
//    }
//    public static void main(String[] args) {
//        Person person = new Person("Adam", 40.5, 178);
//        if (person.validateName()) {
//            if (person.validateAge() && person.validateHeight()) {
//                System.out.println("User is older than 30 and taller than 160cm");
//            } else {
//                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
//            }
//        }
//    }
//}
//
//
//
//
//
//
//
//
//
