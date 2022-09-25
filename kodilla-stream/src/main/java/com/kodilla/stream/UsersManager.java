package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
       // processUsersStream();
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
    }

   // private static void processUsersStream() {
   // UserRepository.getUserList()
    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UserRepository.getUserList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
             //   .forEach(username -> System.out.println(username));
                .collect(Collectors.toList());
        return usernames;
    }
    public static String getUserName(User user) {
        return user.getUsername();
    }
    public static List<User> filterUsersByAge(int age) {
        List<User> usersAge = UserRepository.getUserList()
                .stream()
                .filter(x -> (x.getAge() > age))
                .map(y -> y.getUser(y.getUsername(), y.getAge(), y.getNumberOfPost(), y.getGroup()))
                .collect(Collectors.toList());
        return usersAge;
    }
}
