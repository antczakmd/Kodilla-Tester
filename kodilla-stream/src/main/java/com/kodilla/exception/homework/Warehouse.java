package com.kodilla.exception.homework;
import java.util.HashSet;
import java.util.Set;
public class Warehouse {

    private Set<Order> orderList = new HashSet<>();

    public Order addOrder(Order order) {
        orderList.add(order);
        System.out.println("Order " + order + " added.");

    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        System.out.println("Searching for order No. " + number);

    }
}