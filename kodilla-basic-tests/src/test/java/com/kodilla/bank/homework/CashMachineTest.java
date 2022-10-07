package com.kodilla.bank.homework;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CashMachineTest {

    @Test
    public void shouldHaveZeroLength(){
        CashMachine cashMachine = new CashMachine();
        int a = cashMachine.getOperations().length;
        assertEquals(0, a);
    }

    @Test
    public void shouldAddTwoElementsToArray(){
        CashMachine cashMachine = new CashMachine();

        cashMachine.addOperation(100);
        cashMachine.addOperation(200);
        int a = cashMachine.getOperations().length;
        int b[] = cashMachine.getOperations();
        int c = b[0];
        assertEquals(100, b[0]);
        assertEquals(200, b[1]);
        assertEquals(2, a);
    }
    @Test
    public void shouldNotAddZeroToArray(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(0);
        cashMachine.addOperation(0);
        cashMachine.addOperation(1);
        int a = cashMachine.getOperations().length;
        assertEquals(1, a);
    }
    @Test
    public void shouldNotAddAmountLessThanMinus2000ToArray(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(-2500);
        cashMachine.addOperation(3000);
        cashMachine.addOperation(100);
        int a = cashMachine.getOperations().length;
        assertEquals(2, a);
    }
    @Test
    public void shouldAddNumberOfTransaction(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addNumberOfTransaction();
        cashMachine.addNumberOfTransaction();
        cashMachine.addNumberOfTransaction();
        cashMachine.addNumberOfTransaction();
        assertEquals(5, cashMachine.addNumberOfTransaction());
    }

    @Test
    public void shouldAddAmountToBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(0);
        cashMachine.addOperation(5000);
        cashMachine.addOperation(-500);
        assertEquals(9500, cashMachine.balanceOfCashMachine());
    }
    @Test
    public void shouldNotAddAmountLessThanMinus2000ToBalance(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(1000);
        cashMachine.addOperation(-5000);
        cashMachine.addOperation(0);
        assertEquals(11000, cashMachine.balanceOfCashMachine());
    }
    @Test
    public void shouldNotAddZeroToBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(-0);
        cashMachine.addOperation(2000);
        cashMachine.addOperation(0);
        assertEquals(12000, cashMachine.balanceOfCashMachine());
    }
    @Test
    public void shouldCountAverageOfOperation(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(-3000);
        cashMachine.addOperation(3000);
        cashMachine.addOperation(1000);
        cashMachine.addOperation(0);
        assertEquals(2000, cashMachine.getAverageOfTransaction());
    }
    @ Test
    public void shouldAddTogetherAllWithdraws(){      // getBalanceOfWithdraws()
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(-1000);
        cashMachine.addOperation(-2000);
        cashMachine.addOperation(-2000);
        assertEquals(-1000, cashMachine.getBalanceOfWithdraws());
    }
    @ Test
    public void shouldNotAddDeposits(){             // getBalanceOfWithdraws()
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(-1000);
        cashMachine.addOperation(2000);
        cashMachine.addOperation(-2000);
        assertEquals(-1000, cashMachine.getBalanceOfWithdraws());
    }

    @Test
    public  void shouldAddTogetherAllDeposits(){   // getBalanceOfDeposits
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(   1000);
        cashMachine.addOperation(-0);
        cashMachine.addOperation(-2000);
        assertEquals(1000, cashMachine.getBalanceOfDeposits());

    }
    @ Test
    public void shouldNotAddWithdrawsToDeposits(){      // getBalanceOfDeposits
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(-1000);
        cashMachine.addOperation(0);
        cashMachine.addOperation(2000);
        assertEquals(2000, cashMachine.getBalanceOfDeposits());
    }
    @ Test
    public void shouldCountNumbersOfWithdrawsWithoutZeroAndDeposits(){      // getNumberOfWithdraw
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(-1000);
        cashMachine.addOperation(-1000);
        cashMachine.addOperation(0);
        cashMachine.addOperation(2000);
        cashMachine.addOperation(-234);
        assertEquals(3, cashMachine.getNumberOfWithdraws());
    }
    @ Test
    public void shouldCountNumbersOfDepositsWithoutZeroAndWithdraw(){      // getNumberOfDeposits
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(-1000);
        cashMachine.addOperation(1000);
        cashMachine.addOperation(0);
        cashMachine.addOperation(2000);
        assertEquals(2, cashMachine.getNumberOfDeposits());
    }
}