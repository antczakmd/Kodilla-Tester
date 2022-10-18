package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
    private double value;
    private LocalDate orderDate;
    private String whoOrdered;

    public Order(double value, LocalDate orderDate, String whoOrdered) {
        this.value = value;
        this.orderDate = orderDate;
        this.whoOrdered = whoOrdered;
    }

    public double getValue() {
        return value;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getWhoOrdered() {
        return whoOrdered;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.value, value) == 0 && Objects.equals(orderDate, order.orderDate) && Objects.equals(whoOrdered, order.whoOrdered);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, orderDate, whoOrdered);
    }

    @Override
    public String toString() {
        return "Order{" +
                "value=" + value +
                ", orderDate=" + orderDate +
                ", whoOrdered='" + whoOrdered + '\'' +
                '}';
    }

    public void setWhoOrdered(String anonymous) {
    }
}
