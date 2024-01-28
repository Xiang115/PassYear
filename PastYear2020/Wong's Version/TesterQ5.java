/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ2020_Q5;

/**
 *
 * @author HP
 */
public class TesterQ5 {
    public static void main(String[] args) {
        Job J1=new Job("J1",252,20);
        Job J2=new Job("J2",108,10);
        Job J3=new Job("J3",72,25);
        
        CloudPackage a=new CloudPackage("P2-15",4,15,1.24);
        CloudPackage b=new CloudPackage("P2-30",6,30,2.11);
        CloudPackage c=new CloudPackage("R5-20",4,20,1.38);     
        CloudPackage d=new CloudPackage("R6-20",6,20,1.88);
        
        Job multi[]={J1,J2,J3};
        CloudPackage multiples[]={a,b,c,d};
        
        double total=0;
        for(Job job: multi){
            CloudPackage cheap=new CloudPackage("Cheapest",1,5,10000000);
            for(CloudPackage list:multiples){
                if(list.Check(job) && list.TotalCost(job)<cheap.TotalCost(job)){
                    cheap=list;
                }
            }
            total+=cheap.getTotalCost();
            System.out.println(job);
            System.out.println(cheap);
        }    
        System.out.printf("Total Cost : "+total+"\n");
    }    
}
