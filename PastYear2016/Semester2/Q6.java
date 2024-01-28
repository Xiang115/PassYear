/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2016_2;

/**
 *
 * @author Goh
 */
public class Q6 {
    public static void main(String[] args) {
        FinancialRecord acc_a = new FinancialRecord(1234,10000);
        acc_a.setAnuualInterest(7.77);
        System.out.println("The information about record A is as follow");
        acc_a.displayRecordInfo();
        System.out.println("");
        
        FinancialRecord acc_b = new FinancialRecord(1235,20000);
        acc_b.setAnuualInterest(8.0);
        System.out.println("The information about record B is as follow");
        acc_b.displayRecordInfo();
        System.out.printf("The monthly interest rate is: %f\n",acc_b.getMonthlyInterestRate());
        acc_b.deposit(1500);
        acc_b.withdraw(500);
    }
}
