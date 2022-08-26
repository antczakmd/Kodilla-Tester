package com.kodilla.kodilaintro;
import java.util.Random;

public class RandomNumbers {

    private int min;
    private int max;

    public static void main(String[] args) {

    }
    public RandomNumbers(){
        this.max = max;
        this.min = min;
        Random random = new Random();
        int result = 0;
        int sum = 0;
        int max = 5000;
        int getMin = 31;
        int getMax = 0;



        while(sum <= max) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            if (temp < getMin){
                getMin = temp;
                temp = Math.min(temp, 0);
                System.out.println(getMin);
            }
            if (temp > getMax){
                getMax = temp;
                temp = Math.max(temp, 30);
                System.out.println(getMax);
            }
        }
    }














}



//while(sum>=5000){
//        System.out.println(sum);
//        sum++;
     //   }
//
//        RandomNumbes 1 = new RandomNumbes(1);
//        Numbers 2 = new Numbers(2);
//        Numbers 3 = new Numbers(3);
//        Numbers 4 = new Numbers(4);
//        Numbers 5 = new Numbers(5);
//        Numbers 6 = new Numbers(6);
//        Numbers 7 = new Numbers(7);
//        Numbers 8 = new Numbers(8);
//        Numbers 9 = new Numbers(9);
//        Numbers 10 = new Numbers(10);
//        Numbers 11 = new Numbers(11);
//        Numbers 12 = new Numbers(12);
//        Numbers 13 = new Numbers(13);
//        Numbers 14 = new Numbers(14);
//        Numbers 15 = new Numbers(15);
//        Numbers 16 = new Numbers(16);
//        Numbers 17 = new Numbers(17);
//        Numbers 18 = new Numbers(18);
//        Numbers 19 = new Numbers(19);
//        Numbers 20 = new Numbers(20);
//        Numbers 21 = new Numbers(21);
//        Numbers 22 = new Numbers(22);
//        Numbers 23 = new Numbers(23);
//        Numbers 24 = new Numbers(24);
//        Numbers 25 = new Numbers(25);
//        Numbers 26 = new Numbers(26);
//        Numbers 27 = new Numbers(27);
//        Numbers 28 = new Numbers(28);
//        Numbers 29 = new Numbers(29);
//        Numbers 30 = new Numbers(30);
//
//
//
//        RandomNumbers randomNumbers = new RandomNumbers[30];
//        randomNumbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
//







//
//            int result = 0;
//            int sum = 0;
//            while (sum < max) {
//                int temp = random.nextInt(30);
//                sum = sum + i;
//                result++;
//            }
//            return result;
//
//            if (user[i] >= max) {
//                System.out.printf("Wartosc max wynosi %d ", user[i]);
//            }
//            if (user[i] <= min) {
//                System.out.printf("Wartosc min wynosi %d ", user[i]);i
             // to wszystko w petli ktora losuje liczby





