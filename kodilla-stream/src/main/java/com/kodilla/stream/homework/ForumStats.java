package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UserRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgAboveForty = UserRepository.getUserList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map(User::getNumberOfPost)
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("Average posts for users age grater than 40 years old " + avgAboveForty);

        double avgBelowForty = UserRepository.getUserList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(User::getNumberOfPost)
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("Average posts for users age below 40 years old " + avgBelowForty);
    }
}
