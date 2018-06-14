package ru.otus;


public class AccountOfBank {
    private int balance;

    public AccountOfBank() {
        this.balance = 0;
    }

    public AccountOfBank(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void addBalance(int summa) {
        this.balance += summa;
    }

    public void reduceBalance(int summa) {
        this.balance -= summa;
    }

    @Override
    public String toString() {
        return "AccountOfBank{" +
                "balance=" + balance +
                '}';
    }
}
