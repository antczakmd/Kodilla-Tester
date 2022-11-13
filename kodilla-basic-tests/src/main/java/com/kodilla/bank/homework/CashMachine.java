package com.kodilla.bank.homework;

public class CashMachine {


    private int[] operations;
    private int size;


    public CashMachine() {
        this.operations = new int[0];
        this.size = 0;


    }

    public void addOperation(int operationAmount) {
        if (operationAmount == 0 ) return; // maksymalna wypłata 1000, 0 - brak operacji
        size++;
        int[] newTab = new int[this.size];
        System.arraycopy(operations, 0, newTab, 0, operations.length);
        newTab[this.size - 1] = operationAmount;
        this.operations = newTab;
    }

    public int balanceOfCashMachine() {
        int sum = 0;
        for (int i = 0; i < operations.length; i++) {
            sum += operations[i];
        }

        return sum;
    }
    public int getBalanceOfWithdraws() {
        int sum = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i] > 0) operations[i] = 0;
            else operations[i] = operations[i];
            sum += operations[i];
        }
        return sum;
    }

    public int getBalanceOfDeposits() {
        int sum = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i] < 0) operations[i] = 0;
            else operations[i] = operations[i];
            sum += operations[i];
        }
        return sum;
    }
    public int getNumberOfWithdraws() {
        int withdraw = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i] < 0 ) withdraw++;
            else withdraw = withdraw;
        }
        return withdraw;
    }
    public int getNumberOfDeposits() {
        int deposit = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i] > 0 ) deposit++;
            else deposit = deposit;
        }
        return deposit;
    }





    public int[] getOperations() {
        return operations;
    }
    public double getAverageOfTransaction() {
        if ( operations.length == 0 ) return 0;
        int sum = 0;
        for ( int i = 0; i < operations.length; i++) {
            sum += operations[i];
        }
        return sum / this.operations.length;

    }
}
