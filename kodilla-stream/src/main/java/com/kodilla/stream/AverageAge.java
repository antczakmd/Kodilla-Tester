package com.kodilla.stream;

public class AverageAge {
    public static void main(String[] args) {
        double avg = UserRepository.getUserList()
                .stream()
                .mapToInt(n -> n.getAge())
                .average()
                .getAsDouble();
        System.out.println(avg);
//        UserRepository.getUserList()
//                .stream()
//                .map(u -> u.getAge())
//                .mapToInt()
    }
}
