/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pastyear_2023_1;

/**
 *
 * @author Goh
 */
public class DataBuoy {
    private String BuoyID;
    private int latitude;
    private int longitude;
    private double AirTemp;
    private double WaterTemp;

    public DataBuoy(String a, int b, int c, double d, double e) {
        this.BuoyID = a;
        this.latitude = b;
        this.longitude = c;
        this.AirTemp = d;
        this.WaterTemp = e;
    }
    
    public double getWaterTemp(){
        return this.WaterTemp;
    }
    
    public int getLatitude(){
        return this.latitude;
    }
    
    public int getLongitude(){
        return this.longitude;
    }
    
    @Override
    public String toString(){
        return String.format("%-20s %-10d %-10d %-10.2f %-10.2f",this.BuoyID,this.latitude,
                this.longitude,this.AirTemp,this.WaterTemp);
    }
}
