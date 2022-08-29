package com.kodilla.collections.interfaces.homework;

public class Mercedes implements Car {
    private int speed;

    public Mercedes() {
        this.speed = 0;
    }
        @Override
        public int getSpeed () {
            return speed;
        }

        @Override
        public void increaseSpeed () {
            speed = speed + 20;

        }

        @Override
        public void decreaseSpeed () {
            speed = speed - 30;
        }
    }
