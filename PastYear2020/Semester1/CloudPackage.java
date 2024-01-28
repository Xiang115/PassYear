/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2020_1;

/**
 *
 * @author Goh
 */
public class CloudPackage extends Cloud{
    private int NoCore;
    private int Memory;
    private double PriceHour;
    
    public CloudPackage(String Name, int NoCore, int Memory, double PriceHour){
        super(Name);
        this.NoCore = NoCore;
        this.Memory = Memory;
        this.PriceHour = PriceHour;
    }
    
    public boolean check(Job object){
        return this.Memory>=object.getMemory();
    }
    
    public double totalCost(Job object){
        Total = (double)object.getNoTask()/this.NoCore*PriceHour;
        return Total;
    }
}
