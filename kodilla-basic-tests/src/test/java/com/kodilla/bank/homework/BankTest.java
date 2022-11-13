package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @Test
    public void shouldAddOperationsToNewCashMachine() {
        Bank bank = new Bank();
        CashMachine Wodna = new CashMachine();
        bank.addCashMachine(Wodna);
        Wodna.addOperation(1000);
        assertEquals(1000, Wodna.balanceOfCashMachine());
    }



    @Test
    public void shouldAddNewOperationsToNewCashMachine() {
        Bank bank = new Bank();
        CashMachine Wodna = new CashMachine();
        bank.addCashMachine(Wodna);
        Wodna.addOperation(1000);
        Wodna.addOperation(3000);
        Wodna.addOperation(-4000);
        assertEquals(0, bank.getBalanceOfAllCashMachines());
    }

    @Test
    public void shouldCountBalanceOfAllCashMachines() {
        Bank bank = new Bank();
        CashMachine Wodna = new CashMachine();
        bank.addCashMachine(Wodna);
        Wodna.addOperation(2000);
        Wodna.addOperation(3000);
        CashMachine Piotrkowska = new CashMachine();
        bank.addCashMachine(Piotrkowska);
        Piotrkowska.addOperation(5000);
        Piotrkowska.addOperation(4000);
        CashMachine Dluga = new CashMachine();
        bank.addCashMachine(Dluga);
        Dluga.addOperation(-3000);
        assertEquals(11000, bank.getBalanceOfAllCashMachines());
    }

    @Test
    public void shouldCountNumberOfAllWithdraws() {
        Bank bank = new Bank();
        CashMachine Wodna = new CashMachine();
        bank.addCashMachine(Wodna);
        Wodna.addOperation(-3000);
        Wodna.addOperation(-4000);
        CashMachine Piotrkowska = new CashMachine();
        bank.addCashMachine(Piotrkowska);
        Piotrkowska.addOperation(-2000);
        Piotrkowska.addOperation(0);
        CashMachine Dluga = new CashMachine();
        bank.addCashMachine(Dluga);
        Dluga.addOperation(-5000);
        Dluga.addOperation(-2000);
        assertEquals(5, bank.numberOfAllWithdraws());
    }

    @Test
    public void shouldCountNumberOfAllDeposits() {
        Bank bank = new Bank();
        CashMachine Wodna = new CashMachine();
        bank.addCashMachine(Wodna);
        Wodna.addOperation(3000);
        Wodna.addOperation(4000);
        CashMachine Piotrkowska = new CashMachine();
        bank.addCashMachine(Piotrkowska);
        Piotrkowska.addOperation(2000);
        Piotrkowska.addOperation(0);
        CashMachine Dluga = new CashMachine();
        bank.addCashMachine(Dluga);
        Dluga.addOperation(5000);
        Dluga.addOperation(1000);
        assertEquals(5, bank.numberOfAllDeposits());
    }

    @Test
    public void shouldCountAverageOfAllWithdraws() {
        Bank bank = new Bank();
        CashMachine Wodna = new CashMachine();
        bank.addCashMachine(Wodna);
        Wodna.addOperation(-3000);
        Wodna.addOperation(-4000);
        CashMachine Piotrkowska = new CashMachine();
        bank.addCashMachine(Piotrkowska);
        Piotrkowska.addOperation(-2000);
        Piotrkowska.addOperation(0);
        CashMachine Dluga = new CashMachine();
        bank.addCashMachine(Dluga);
        Dluga.addOperation(-5000);
        Dluga.addOperation(-2000);
        assertEquals(-3200, bank.averageOfAllWithdraws());
    }
    @Test
    public void shouldCountAverageOfAllDeposits() {
        Bank bank = new Bank();
        CashMachine Wodna = new CashMachine();
        bank.addCashMachine(Wodna);
        Wodna.addOperation(3000);
        Wodna.addOperation(4000);
        CashMachine Piotrkowska = new CashMachine();
        bank.addCashMachine(Piotrkowska);
        Piotrkowska.addOperation(2000);
        Piotrkowska.addOperation(0);
        CashMachine Dluga = new CashMachine();
        bank.addCashMachine(Dluga);
        Dluga.addOperation(5000);
        Dluga.addOperation(1000);
        assertEquals(3000, bank.averageOfAllDeposits(), 0.01);
    }
}