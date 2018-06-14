package ru.otus;


import java.util.ArrayList;

public class Atm {
    private ArrayList<Money> nominal;
    private AccountOfBank account;

    public Atm(ArrayList<Money> nominal, AccountOfBank account) {
        this.nominal = nominal;
        this.account = account;
    }

    public void pushMoney(ArrayList<Money> inSumma) {
        for (Money m : inSumma) {
            account.addBalance(m.getNominal());
        }

    }

    public ArrayList<Money> pullMoney(int outSumma) {
        ArrayList<Money> summa = new ArrayList<Money>();
        int reduceSumma = 0;
        nominal.sort((Money m1, Money m2) -> m2.getNominal() - m1.getNominal());
        for (Money m : nominal) {
            while (outSumma >= m.getNominal()) {
                summa.add(m);
                reduceSumma+=m.getNominal();
                outSumma -= m.getNominal();
            }
        }
        if (outSumma > 0) {
            throw new RuntimeException("Can't returne money");
        }
        account.reduceBalance(reduceSumma);
        return summa;
    }
    public int getBalance(){
        return account.getBalance();
    }

    @Override
    public String toString() {
        return "Atm{" +
                "nominal=" + nominal +
                ", account=" + account +
                '}';
    }
}
