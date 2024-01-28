/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pastyear_2019_2;

/**
 *
 * @author Goh
 */
import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String CustomerName, CustomerID;
        int Quantity;
        double unitPrice;
        
        System.out.print("Enter customer name :");
        CustomerName = sc.next();
        System.out.print("Enter customer ID :");
        CustomerID = sc.next();
        System.out.print("Enter quantity ordered :");
        Quantity = sc.nextInt();
        System.out.print("Enter price per unit :");
        unitPrice = sc.nextDouble();
        Order c1 = new Order(CustomerName, CustomerID,Quantity,unitPrice);
        
        System.out.println("\nOrder record");
        System.out.println(c1);
        
        System.out.println("\nShipped");
        ShippedOrder c2 = new ShippedOrder("joe","123",10,5);
        System.out.println(c2);
    }
}
