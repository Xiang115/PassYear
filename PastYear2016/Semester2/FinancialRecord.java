/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2016_2;

/**
 *
 * @author Goh
 */
public class FinancialRecord {

    private int id;
    private double balance, annualInterestRate;

    public FinancialRecord() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
    }

    public FinancialRecord(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public double getMonthlyInterestRate() {
        return this.annualInterestRate / 12;
    }

    public void withdraw(double amount) {
        System.out.printf("Previous balance: \n",this.balance);
        if (amount < balance) {
            this.balance -= amount;
            System.out.printf("Current balance after withdrawal of RM %.1f is: %.1f\n", amount, this.balance);
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void deposit(double amount) {
        System.out.printf("Previous balance: \n",this.balance);
        this.balance += amount;
        System.out.printf("Current balance after deposit of RM %.1f is: %.1f\n", amount, this.balance);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnuualInterest() {
        return this.annualInterestRate;
    }

    public void setAnuualInterest(double interest) {
        this.annualInterestRate = interest;
    }

    public void displayRecordInfo() {
        System.out.println("Financial record id is: RM" + getId());
        System.out.println("Financial record balance is: RM"+ getBalance());
        System.out.println("Annual interest rate is: " + getAnuualInterest());
    }
}
