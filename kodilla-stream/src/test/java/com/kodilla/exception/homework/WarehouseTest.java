package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class WarehouseTest {
    Set<Order> orderList = new HashSet<>();

    Warehouse warehouse = new Warehouse();
    @Test
    public void testGetOrder() throws OrderDoesntExistException {

        //when
        warehouse.addOrder(new Order("2"));
        warehouse.getOrder("2");
        //then
        Order expectedOrder = new Order("2");
        assertEquals(expectedOrder.getNumber(), warehouse.getOrder("2").getNumber());
    }

    @Test
    public void testGetOrder_withException() throws OrderDoesntExistException {
        //when
        warehouse.addOrder(new Order("2"));

        //then

        assertThrows(OrderDoesntExistException.class, () -> {
            warehouse.getOrder("3");                }
        );
    }
}