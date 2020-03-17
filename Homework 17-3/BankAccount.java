package homework.pkg17.pkg3;

import java.util.ArrayList;

public class BankAccount {

    private int number;
    private String name;
    private double amount = 0;
    private boolean active;
    private ArrayList<String> transactions = new ArrayList();
    private static int counter;

    public BankAccount() {
        counter++;
        transactions.add("Account Created");
        System.out.println("Account Successfully Opened");

    }
    public BankAccount(String name, int number){
        this.name=name;
        this.number=number;
        counter++;
        transactions.add("Account Created");
        System.out.println("Account Successfully Opened");
    }
    public BankAccount (String name, int number, double amount, boolean active){
        this.name=name;
        this.number=number;
        this.amount=amount;
        this.active=active;
        counter++;
        transactions.add("Account Created");
        System.out.println("Account Successfully Opened");
        
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getNumber() {
        return number;
    }

    public double getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public boolean getActive() {
        return active;
    }

    public ArrayList getTransactions() {
        return transactions;
    }

    public void getAccountDetails() {
        System.out.println("Account Details");
        System.out.println("Number: " + number);
        System.out.println("Name:   " + name);
        System.out.println("Amount: " + amount);
        System.out.println("Active: " + active);
    }

    public void deposit(double money) {
        this.amount = this.amount + money;
        transactions.add("deposit");
        System.out.println("Deposit Successful");
    }

    public void withdraw(double money) {
        if (money > this.amount) {
            System.out.println("Insufficient Funds. Balance; " + this.amount);
        }
        this.amount = this.amount - money;
        transactions.add("withdrawal");
        System.out.println("Withdrawal Successful");
    }
    public static int accountsOpened(){
        return counter;
    }

}
