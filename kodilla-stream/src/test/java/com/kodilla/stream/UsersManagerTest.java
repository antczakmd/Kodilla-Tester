package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {

    @Test
    public void filterChemistGroupUsername() {
        List<String> test = new ArrayList<>();
        String one = "Walter White" ;
        String two = "Jessie Pinkman" ;
        test.add(one);
        test.add(two);
        assertEquals(test, UsersManager.filterChemistGroupUsernames());
    }

    @Test
    public void filterChemistByAge() {
        List<User> test = new ArrayList<>();
            User one = new User("Jessie Pinkman", 25, 4648, "Sales");
            test.add(one);
            assertEquals(4, UsersManager.filterUsersByAge(40).size() );
        }
    }