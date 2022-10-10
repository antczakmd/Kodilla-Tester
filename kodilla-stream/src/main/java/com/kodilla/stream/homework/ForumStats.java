package com.kodilla.stream.homework;

import com.kodilla.stream.UserRepository;
import com.kodilla.stream.User;

import java.util.ArrayList;
import java.util.List;

public class ForumStats {
    public static void main(String[] args) {

//        System.out.println(averageOfPostsOver40(UserRepository.getUsersList()));
//        System.out.println(averageOfPostsUnder40(UserRepository.getUsersList()));
    }
    public static double averageOfPostsOver40(List<User> userList) {
        double average = userList
                .stream()
                .filter( x -> x.getAge() >= 40 && x.getAge() < 100)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        return average;
    }

    public static double averageOfPostsUnder40(List<User> usersList) {
        double average = usersList
                .stream()
                .filter( x -> x.getAge() < 40 && x.getAge() > 0)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        return average;
    }
}