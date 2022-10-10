package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UserRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {
    @Test
    public void shoudCountAverageOfPostsUsersOver40() {
        List<User> testList = UserRepository.getUserList();
        testList.add(new User("TestName", 40, 11, "TestGroup"));
        double test = ForumStats.averageOfPostsOver40(testList);
        assertEquals(4, test);
    }
    @Test
    public void shoudCountAverageOfPostsUsersUnder40() {
        List<User> testList = UserRepository.getUserList();
        testList.add(new User("Test", 39, 36, "Test"));
        double test = ForumStats.averageOfPostsUnder40(testList);
        assertEquals(1600, test);
    }
    @Test
    public void shoudNotCountPostOfUsersZeroAge() {
        List<User> testList = UserRepository.getUserList();
        testList.add(new User("Test", 0, 36, "Test"));
        double test = ForumStats.averageOfPostsUnder40(testList);
        assertEquals(2382, test);
    }
    @Test
    public  void shoudNotCountPostsOfUsersOverOneHundredYears() {
        List<User> testList = UserRepository.getUserList();
        testList.add(new User("TestName", 100, 10000, "TestGroup"));
        testList.add(new User("TestName", 40, 11, "TestGroup"));
        double test = ForumStats.averageOfPostsOver40(testList);
        assertEquals(4, test);
    }
}