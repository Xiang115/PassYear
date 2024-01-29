/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ2022_3;

/**
 *
 * @author HP
 */
public class Databuoy {
    private String buoy_id;
    private int latitude;
    private int longitude;
    private float air_temp;
    private float water_temp;
    
    public Databuoy(String buoy_id, int latitude, int longitude, float air_temp, float water_temp){
        this.buoy_id=buoy_id;
        this.latitude=latitude;
        this.longitude=longitude;
        this.air_temp=air_temp;
        this.water_temp=water_temp;
    }
    
    protected int getlatitude(){
        return latitude;
    }
    
    protected int getlongitude(){
        return longitude;
    }
    
    protected float getwater_temp(){
        return water_temp;
    }
    
    @Override
    public String toString(){
        return String.format("%-20s%-8s%-8s%-10s%-10s", buoy_id,latitude,longitude,air_temp,water_temp);
    }
}
