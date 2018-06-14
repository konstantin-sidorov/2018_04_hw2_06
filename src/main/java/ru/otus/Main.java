package ru.otus;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Money> nominal = new ArrayList<Money>();
        AccountOfBank account = new AccountOfBank();
        Atm bankomat = new Atm(nominal, account);
        //1 priem banknot
        ArrayList<Money> inSumma = new ArrayList<Money>();
        inSumma.add(new Rur2000());
        inSumma.add(new Rur200());
        bankomat.pushMoney(inSumma);
        System.out.println(account);
        //2 vydacha banknot
        nominal.add(new Rur100());
        nominal.add(new Rur200());
        nominal.add(new Rur500());
        nominal.add(new Rur1000());
        nominal.add(new Rur2000());
        nominal.add(new Rur5000());
        ArrayList<Money> outSumma = bankomat.pullMoney(1600);
        System.out.println(outSumma);
        //3 ostatok Money
        System.out.println("Balance: "+ bankomat.getBalance());

    }
}
