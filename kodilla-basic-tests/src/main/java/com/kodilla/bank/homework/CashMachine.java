package com.kodilla.bank.homework;

public class CashMachine {
    public int moneyIn;
    public int moneyOut;

    String name;

    public CashMachine(String name, int moneyIn, int moneyOut){
        this.moneyIn = moneyIn;
        this.moneyOut = moneyOut;
    }

    class Transactions{

        public static void main(String[] args) {

            CashMachine atm1 = new CashMachine("atm1", 500, -300);
            CashMachine atm2 = new CashMachine("atm2", 400, -500);
            CashMachine atm3 = new CashMachine("atm3", 240, -130);
            CashMachine atm4 = new CashMachine("atm4", 1000, -1200);

            CashMachine[] cashMachines = new CashMachine[4];
            cashMachines[0] = atm1;
            cashMachines[1] = atm2;
            cashMachines[2] = atm3;
            cashMachines[3] = atm4;



        }

    }
}
