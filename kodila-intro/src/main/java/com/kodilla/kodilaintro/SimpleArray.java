package com.kodilla.kodilaintro;
public class SimpleArray {
    public static void main(String[] args) {
        String[] car = new String[5];
        car[0] = "Jetta";
        car[1] = "Mx5";
        car[2] = "T3";
        car[3] = "Ix20";
        car[4] = "Panda";

        for(int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
        }
    }
}
