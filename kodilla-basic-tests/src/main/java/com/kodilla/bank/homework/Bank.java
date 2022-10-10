package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashmachines;
    private int size;

    public Bank() {
        this.cashmachines = new CashMachine[0];
        this.size = 0;
    }

    public CashMachine[] getCashmachines() {
        return cashmachines;
    }

    public void addCashMachine(CashMachine index) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(cashmachines, 0, newTab, 0, cashmachines.length);
        newTab[this.size - 1 ] = index;
        this.cashmachines = newTab;
    }
    public int getBalanceOfAllCashMachines() {
        int sum = 0;
        for (int i = 0; i < cashmachines.length; i++){
            sum += cashmachines[i].balanceOfCashMachine();
        }
        return sum;
    }
    public int numberOfAllWithdraws() {
        int withdraws = 0;
        for (int i = 0; i < cashmachines.length; i++) {
            withdraws += cashmachines[i].getNumberOfWithdraws();
        }
        return withdraws;
    }
    public int numberOfAllDeposits() {
        int deposits = 0;
        for (int i = 0; i < cashmachines.length; i++) {
            deposits += cashmachines[i].getNumberOfDeposits();
        }
        return deposits;
    }
    public double averageOfAllWithdraws() {
        int avgOfWithdraws = 0;
        int sumOfWithdraws = 0;
        int numberOfWithdraws =0;

        for (int i = 0; i < cashmachines.length; i++) {
            sumOfWithdraws += cashmachines[i].getBalanceOfWithdraws();
            numberOfWithdraws += cashmachines[i].getNumberOfWithdraws();
        }
        if (numberOfWithdraws == 0 ) numberOfWithdraws = 1;
        avgOfWithdraws = sumOfWithdraws / numberOfWithdraws;

        return avgOfWithdraws;
    }
    public double averageOfAllDeposits() {
        int avgOfDeposits = 0;
        int sumOfDeposits = 0;
        int numberOfDeposits = 0;

        for (int i = 0; i < cashmachines.length; i++) {
            sumOfDeposits += cashmachines[i].getBalanceOfDeposits();
            numberOfDeposits += cashmachines[i].getNumberOfDeposits();
        }
        if (numberOfDeposits == 0 ) numberOfDeposits = 1;
        avgOfDeposits = sumOfDeposits / numberOfDeposits;

        return avgOfDeposits;
    }

}
