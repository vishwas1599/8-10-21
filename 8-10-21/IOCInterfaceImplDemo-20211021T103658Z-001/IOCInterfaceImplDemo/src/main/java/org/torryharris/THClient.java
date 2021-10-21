package org.torryharris;

public class THClient {
    Bank bank;

    // for Constructor injection
    public THClient(Bank bank)
    {
        this.bank=bank;
    }

    public Bank getBank() {
        return bank;
    }
    // for Setter injection
    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public double getBalance(long accid)
    {
        System.out.println("In torry harris client : Get Balance");
        return bank.getBalance(accid);
    }

    public double withdraw(long accid,double amount)
    {
        System.out.println("In torry harris client :withdraw");
        return bank.withdraw(accid,amount);
    }

    public double deposit(long accid,double amount)
    {
        System.out.println("In torry harris client :deposit");
        return bank.deposit(accid,amount);
    }



}
