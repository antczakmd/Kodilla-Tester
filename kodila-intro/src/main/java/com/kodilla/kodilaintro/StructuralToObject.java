////package com.kodilla.kodilaintro;
////
////public class StructuralToObject {
////    public static void main(String[] args) {
////        String name = "Adam";
////        double age = 40.5;
////        double height = 178;
////
////        if (name != null) {
////            if (age > 30 && height > 160) {
////                System.out.println("User is older than 30 and taller than 160cm");
////            } else {
////                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
////            }
////        }
////    }
////}
//
package com.kodilla.kodilaintro;

public class StructuralToObject {
    private static String name;
    private static double age;
    private static double height;

    public StructuralToObject(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    //    public static void main(String[] args) {
//        StructuralToObject structuralToObject = new StructuralToObject("Adam", 40.5, 178);
//        System.out.println(structuralToObject.name + "Adam " + structuralToObject.age + "40.5 " + structuralToObject + " 178");
//        if (name != null) {
//            if (age > 30 && height > 160) {
//                System.out.println("User is older than 30 and taller than 160cm");
//            } else {
//                System.out.println("User is 30 (or younger) or 160cm (or shorter)");



        public void validateAge () {
            if (this.age > 30) {
                System.out.println("User is older than 30 years old.");
            } else {
                System.out.println("User is younger than 30 years old.");
            }
        }
        public void validateHeight () {
            if (this.height > 160) {
                System.out.println("User is tall.");
            } else {
                System.out.println("User isn't tall at all.");
            }
        }

    public static void main(String[] args) {
        StructuralToObject structuralToObject = new StructuralToObject("Adam", 40.5, 178);
        System.out.println(structuralToObject.name + "Adam " + structuralToObject.age + "40.5 " + structuralToObject.height + " 178");
    }

    }






