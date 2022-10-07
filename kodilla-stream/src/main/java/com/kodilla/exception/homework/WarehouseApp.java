package com.kodilla.exception.homework;
public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {

        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("4"));

        warehouse.getOrder("2");


        try {
           Order result = warehouse.getOrder("3");
            System.out.println(result);
        } catch (OrderDoesntExistException e) {
            System.out.println("Order not found.");
        }

    }
}