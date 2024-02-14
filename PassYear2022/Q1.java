/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PYQ2022_Q1;
import java.util.Random;
public class Q1 {
    public static void main(String[] args) {
        getPriceValues();
        getEvenNumberYears();
        getCarPlate();
        getRandomWord();
    }
    
    public static void getPriceValues(){
        Random r=new Random();
        System.out.print("3 random price values : ");
        double price=0;
        for(int i=0;i<3;i++){
            price=r.nextInt(201)+100;
            price+=r.nextDouble();
            System.out.printf("%.2f ",price);
        }
        System.out.println();
    }
    
    public static void getEvenNumberYears(){
        Random r=new Random();
        System.out.print("5 random even-numbered years : ");
        int years=0;
        for(int i=0;i<5;i++){
            years=r.nextInt(41)+1990;
            if(years%2==1){
                years+=1;
            }
            System.out.print(years+" ");
        }
        System.out.println();
    }
    
    public static void getCarPlate(){
        Random r=new Random();
        String carplate="";
        for(int i=0;i<5;i++){
            int num=r.nextInt(10);
            carplate+=Integer.toString(num);
        }
        for(int j=0;j<2;j++){
            char letter=(char)('A'+r.nextInt(26));
            carplate+=letter;
        }
        System.out.println("Car Plate Number : "+carplate);
    }
    
    public static void getRandomWord(){
        Random r=new Random();
        String word="";
        for(int i=0;i<8;i++){
            int choices=r.nextInt(2);
            if(choices==0){
                char letter=(char)('A'+r.nextInt(26));
                word+=letter;
            }
            else{
                char letter=(char)('a'+r.nextInt(26));
                word+=letter;
            }
        }
        System.out.println("Random Word : "+word);
    }
}
