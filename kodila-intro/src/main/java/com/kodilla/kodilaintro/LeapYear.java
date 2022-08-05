package com.kodilla.kodilaintro;
public class LeapYear {
    public static void main(String[] args) {
        // LEAP YEAR
        int year = 2018;
        if(( year % 4 == 0) || ( year % 100 == 0) || (year%400 == 0)){
            System.out.println("LEAP YEAR");
        }else {
            System.out.println("NOT A LEAP YEAR");
        }
    }
}
