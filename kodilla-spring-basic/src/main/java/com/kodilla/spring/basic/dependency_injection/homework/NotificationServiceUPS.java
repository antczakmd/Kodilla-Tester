package com.kodilla.spring.basic.dependency_injection.homework;

import com.kodilla.spring.basic.dependency_injection.homework.NotificationService;

public class NotificationServiceUPS implements NotificationService {
    @Override
    public void success(String address) {
        System.out.println("Package delivered to: " + address + " by UPS");
    }
    @Override
    public void fail(String address) {
        System.out.println("Package not delivered to: " + address + " by UPS");
    }
}