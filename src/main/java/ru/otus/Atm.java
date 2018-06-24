package ru.otus;


import java.util.ArrayList;
import java.util.TreeSet;

public class Atm {
    private TreeSet<Nominals> nominal;
    private AccountOfBank account;

    public Atm(TreeSet<Nominals> nominal, AccountOfBank account) {
        this.nominal = nominal;
        this.account = account;
    }

    public void pushMoney(ArrayList<Nominals> inSumma) {
        for (Nominals m : inSumma) {
            account.addBalance(m.getNominal());
        }

    }

    public ArrayList<Nominals> pullMoney(int outSumma) {
        ArrayList<Nominals> summa = new ArrayList<Nominals>();
        int reduceSumma = 0;
        for (Nominals m : this.nominal) {
            while (outSumma >= m.getNominal()) {
                summa.add(m);
                reduceSumma += m.getNominal();
                outSumma -= m.getNominal();
            }
        }
        if (outSumma > 0) {
            throw new RuntimeException("Can't returne money");
        }
        account.reduceBalance(reduceSumma);
        return summa;
    }

    public int getBalance() {
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
