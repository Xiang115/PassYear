/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2016_2;

/**
 *
 * @author Goh
 */
import java.util.*;

public class Q3 {

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of line: ");
//        int line = sc.nextInt();
//        int size = line + (line - 1);
//
//        for (int i = 0; i < line; i++) {
//            int y = line;
//            int x = 2;
//
//            for (int j = size / 2 - i; j > 0; j--) {
//                System.out.print(" ");
//                y--;
//            }
//            while (y > 0) {
//                System.out.print(y);
//                y--;
//            }
//
//            if (i > 0) {
//                for(int z=0;z<i;z++){
//                    System.out.print(x);
//                    x++;
//                }
//            }
//            System.out.println("");
//        }
//    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of line: ");
        int line = sc.nextInt();
        
        for(int i=1;i<=line;i++){
            for(int j=line;j>i;j--){
                System.out.print(" ");
            }
            for(int z=i;z>0;z--){
                System.out.print(z);
            }
            if(i>=2){
                for(int x=2;x<=i;x++){
                    System.out.print(x);
                }
            }
            System.out.println("");
        }
    }
}
