/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ2020_Q5;

/**
 *
 * @author HP
 */
public class CloudPackage extends Cloud{
    private int numofcore;
    private int memory;
    private double priceperhour;
    
    public CloudPackage(String CloudPackage,double TotalCost){
        super(CloudPackage,TotalCost);
    }
    
    public CloudPackage(String CloudPackage,int numofcore,int memory, double priceperhour){
        super(CloudPackage,0);
        this.numofcore=numofcore;
        this.memory=memory;
        this.priceperhour=priceperhour;
    }
    
    public boolean Check(Job a){
        if(memory>=a.getmemory())
            return true;
        return false;
    }
    
    public double TotalCost(Job a){
        TotalCost=a.getnumoftasks()/numofcore*priceperhour;
        return TotalCost;
    }
}
