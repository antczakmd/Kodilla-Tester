package com.kodilla.spring.basic.dependency_injection.homework;

import com.kodilla.spring.basic.dependency_injection.homework.DeliveryService;
import com.kodilla.spring.basic.dependency_injection.homework.NotificationService;
import com.kodilla.spring.basic.dependency_injection.homework.ShippingCenter;

public class Application {

    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService();
        NotificationService notificationService = new NotificationServiceUPS();

        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);
        shippingCenter.sendPackage("Hill Street 11, New York", 5);
    }
}