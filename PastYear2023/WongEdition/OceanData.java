/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PastYear2023.WongEdition;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class OceanData {
    public static void main(String[] args) {
        String fileinput="C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\ocean_data.csv";
        Databuoy[] data=new Databuoy[25];
        float avg_water_temp;
        
        loaddata(fileinput,data);
        showData(data);
        
        avg_water_temp=calculateAvgWaterTemp(data);
        System.out.println("\nAverage water temperature is "+avg_water_temp);
        
        printmap(data,avg_water_temp);
    }
    
    public static void loaddata(String fileinput,Databuoy[] data){
        try{
            Scanner get=new Scanner(new FileInputStream(fileinput));
            for(int i=0;get.hasNextLine();i++){
                String[] datas=get.nextLine().split(",");
                Databuoy getdata=new Databuoy(datas[0],Integer.parseInt(datas[1]),Integer.parseInt(datas[2]),Float.parseFloat(datas[3]),Float.parseFloat(datas[4]));
                data[i]=getdata;
            }
            get.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
    }
    
    public static void showData(Databuoy[] data){
        System.out.println("Data read from buoy:");
        System.out.printf("%-20s%-8s%-8s%-10s%-10s\n","buoy_id","lat","long","air_t","water_t");
        for(Databuoy showdata: data){
            System.out.println(showdata);
        }
    }
    
    public static float calculateAvgWaterTemp(Databuoy[] data){
        float sum=0;
        for(Databuoy getdata: data){
            sum+=getdata.getwater_temp();
        }
        return sum/data.length;
    }
    
    public static void printmap(Databuoy[] data,float avg_water_temp){
        char[][] map=new char[21][21];
        map[10][10]='N';
        for(Databuoy getdata: data){
            char hmm;
            if(getdata.getwater_temp()<avg_water_temp)
                hmm='C';
            else if(getdata.getwater_temp()>avg_water_temp)
                hmm='H';
            else
                hmm='A';
            map[10-getdata.getlatitude()][10+getdata.getlongitude()]=hmm;
        }
        for(char[] row: map){
            for(char v: row)
                System.out.print(v==0 ?'~':v);
            System.out.println();
        }
    }
}
