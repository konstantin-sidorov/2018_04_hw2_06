package ru.otus;


import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Nominals> nominal = new TreeSet<Nominals>();
        AccountOfBank account = new AccountOfBank();
        Atm bankomat = new Atm(nominal, account);
        //1 priem banknot
        ArrayList<Nominals> inSumma = new ArrayList<Nominals>();
        inSumma.add(Nominals.RUR2000);
        inSumma.add(Nominals.RUR200);
        bankomat.pushMoney(inSumma);
        System.out.println(account);
        //2 vydacha banknot
        nominal.add(Nominals.RUR50);
        nominal.add(Nominals.RUR100);
        nominal.add(Nominals.RUR200);
        nominal.add(Nominals.RUR500);
        nominal.add(Nominals.RUR1000);
        nominal.add(Nominals.RUR2000);
        nominal.add(Nominals.RUR5000);
        ArrayList<Nominals> outSumma = bankomat.pullMoney(1600);
        System.out.println(outSumma);
        //3 ostatok Money
        System.out.println("Balance: "+ bankomat.getBalance());


    }
}
