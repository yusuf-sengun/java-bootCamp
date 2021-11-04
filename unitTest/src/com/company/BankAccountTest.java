package com.company;

;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private  BankAccount account;
    private static int count;

    @org.junit.jupiter.api.BeforeEach
    public void setup()  {
        account = new BankAccount("Yusuf","Şengün",1000.00,BankAccount.CHECKING);
        System.out.println("Running a test ...");
    }

    @org.junit.jupiter.api.Test
    void deposit() {
        double balance = account.deposit(200.00,true);
        assertEquals(1200.00,balance,0);
        assertEquals(1200.00,account.getBalance(),0);
    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        double balance = account.withdraw(200.00,true);
        assertEquals(800,account.getBalance());
    }

    @org.junit.jupiter.api.Test
    void getBalance_deposit() {
        account.deposit(200.00,true);
        assertEquals(1200.00,account.getBalance(),0);
    }
    @org.junit.jupiter.api.Test
    void getBalance_withdraw() {
        account.withdraw(200.00,true);
        assertEquals(800.00,account.getBalance(),0);
    }

    @org.junit.jupiter.api.Test
    public void isChecking_true(){
        assertTrue(account.isChecking(),"The account is NOT checking account");
    }



}