/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2020_1;

/**
 *
 * @author Goh
 */
public class Cloud {
    private final String Cloud_Package;
    protected double Total;
    
    public Cloud(String a){
        this.Cloud_Package = a;
    }
    
    public double getTotal(){
        return Total;
    }
    
    @Override
    public String toString(){
        return String.format("Cloud Package : %s Total Cost = %.2f",this.Cloud_Package,this.Total);
    }
}
