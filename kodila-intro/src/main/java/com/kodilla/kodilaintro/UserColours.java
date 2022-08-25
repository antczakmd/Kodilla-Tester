//Napisz klasę, która zapyta użytkownika o pierwszą literę koloru i na jej podstawie,
//przy użyciu switch wybierze i zwróci pełną nazwę koloru. Do zadania pytania
//użytkownikowi należy skorzystać z metody statycznej (analogicznie jak w powyższym przykładzie
//z pobieraniem wartości a oraz b.








package com.kodilla.kodilaintro;
import java.util.Scanner;


public class UserColours {
        public static void main(String[] args) {



                Scanner scanner = new Scanner(System.in);

                        System.out.println("Select first letter of colour (B-Blue, G-Green, O-Orange, R-Red, Y-Yellow, W-White):");

                        String colour = scanner.nextLine().trim().toUpperCase();
                        switch (colour) {
                                case "B":
                                        System.out.println("Blue" + " Brown" + " Black");
                                        break;
                                case "G":
                                        System.out.println("Green" + " Grey");
                                        break;
                                case "O":
                                        System.out.println("Orange");
                                        break;
                                case "R":
                                        System.out.println("Red" + " Rose");
                                        break;
                                case "Y":
                                        System.out.println("Yellow");
                                        break;
                                case "W":
                                        System.out.println("White");
                                        break;
                                default:
                                        System.out.println("You need new glasses.");
                        }
                }
        }











