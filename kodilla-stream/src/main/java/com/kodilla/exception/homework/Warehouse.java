package com.kodilla.exception.homework;
import java.util.HashSet;
import java.util.Set;
public class Warehouse {

    private Set<Order> orderList = new HashSet<>();

    public void addOrder(Order order) {
        orderList.add(order);
        System.out.println("Order " + order + " added.");


    }

    public Order getOrder(String number) throws OrderDoesntExistException {
    Order result = orderList.stream()
                        .filter(o -> o.getNumber().equals(number))
                                .findFirst().orElseThrow(()-> new OrderDoesntExistException());
        System.out.println("Searching for order No. " + number);
        return result;
    }
}
