package com.codility.app.threads;

public class InterThreadCommunication {
    public static void main(String[] args) {
        CustomerX customer = new CustomerX();
        Runnable t1 = () -> customer.withdraw(12000);
        Runnable t2 = () -> customer.deposit(500);
        new Thread(t1, "t1").start();
        new Thread(t2, "t2").start();
    }
}

class CustomerX{
    int amount = 10000;
    boolean isWithdrawTransactionComplete = false;
    synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " : going to withdraw amount " + amount );
        while (this.amount < amount){
            System.out.println(Thread.currentThread().getName() + " : Insufficient funds, available only " + this.amount + " waiting for additional deposit.");
            try {
                isWithdrawTransactionComplete = false;
                notify();
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.amount-= amount;
        this.isWithdrawTransactionComplete = true;
        System.out.println(Thread.currentThread().getName() + " : Withdrawal completed..");
    }

    synchronized void deposit(int amount){
        while (!isWithdrawTransactionComplete) {
            System.out.println(Thread.currentThread().getName() + " : About to deposit amount " + amount);
            this.amount += amount;
            System.out.println(Thread.currentThread().getName() + " : Deposit completed, Available balance is " + this.amount);
            notifyAll();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}