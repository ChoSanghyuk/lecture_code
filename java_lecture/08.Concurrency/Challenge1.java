package com.company;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {

        ReentrantLock lock = new ReentrantLock();
        BankAccount1 account = new BankAccount1("12345-678" , 1000.0, lock);

        Thread thread1 = new Thread(){ public void run(){

            account.deposit(300.00);
            account.withdraw(50.00);

        }};

        Thread thread2 = new Thread(){ public void run(){

            account.deposit(203.75);
            account.withdraw(100.00);

        }};

        thread1.start();
        thread2.start();

    }
}

class BankAccount1{

    private double balance;
    private String accountNumber;
    private ReentrantLock lock;

    public BankAccount1(String accountNumber, double initialBalance, ReentrantLock lock) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.lock = lock;
    }

    public void deposit(double amount) {
        boolean status = false;
        try{
            boolean go = lock.tryLock(1000, TimeUnit.MILLISECONDS);
            if(go) {
                try{
                    balance += amount;
                    status = true;
                } finally {
                    lock.unlock();
                }
            } else{
                System.out.println("Could not get the lock");
            }
        } catch(InterruptedException e){

        }
        System.out.println("Transaction status = " + status);
    }

    public void withdraw(double amount) {
        boolean status = false;
        try{
            boolean go = lock.tryLock(1000, TimeUnit.MILLISECONDS);
            if(go) {
                try{
                    balance -= amount;
                    status = true;
                } finally {
                    lock.unlock();
                }
            } else{
                System.out.println("Could not get the lock");
            }
        } catch(InterruptedException e){

        }
        System.out.println("Transaction status = " + status);

    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void printAccountNumber(){
        System.out.println("Account number = " + accountNumber);
    }

}
