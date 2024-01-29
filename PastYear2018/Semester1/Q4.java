/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ2018_Q4;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
/**
 *
 * @author HP
 */
public class Q4 {
    public static void main(String[] args) {
        int numofcontest=0;
        try{
            Scanner getlines=new Scanner(new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Q4.txt"));
            while(getlines.hasNextLine()){
                getlines.nextLine();
                numofcontest++;
            }
            getlines.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
        
        String[] name=new String[numofcontest];
        double[][] scores=new double[numofcontest][5];
        int[] difficulties=new int[numofcontest];
        int i=0;
        
        try{
            Scanner getdata=new Scanner(new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Q4.txt"));
            do{
                String data=getdata.nextLine();
                String[] datas=data.split(",");
                name[i]=datas[0];
                for(int j=1;j<datas.length-1;j++){
                    scores[i][j-1]=Double.parseDouble(datas[j]);
                }
                difficulties[i]=Integer.parseInt(datas[datas.length-1]);
                i++;
            }while(getdata.hasNextLine());
        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
        
        for(int k=0;k<numofcontest;k++){
            double low=10,high=0;
            int same=0,same1=0;
            int zerocount=0,zerocount1=0;
            for(int l=0;l<scores[k].length;l++){
                if(scores[k][l]<low)
                    low=scores[k][l];
                if(scores[k][l]>high)
                    high=scores[k][l];
                if(scores[k][l]==low)
                    same++;
                if(scores[k][l]==high)
                    same1++;
            }
            for(int l=0;l<scores[k].length;l++){
                if(low==scores[k][l]){
                    if(same>0 && zerocount>0)
                        continue;
                    else{
                        scores[k][l]=0;
                        zerocount++;
                    }
                }
                if(high==scores[k][l]){
                    if(same>0 && zerocount1>0)
                        continue;
                    else{
                        scores[k][l]=0;
                        zerocount1++;
                    }
                }
            }
        }
        
        double winner=0;
        String winnername="";
        for(int x=0;x<numofcontest;x++){
            double total=0;
            for(int y=0;y<scores[x].length;y++){
                total+=scores[x][y];
            }
            total*=difficulties[x];
            System.out.println(name[x]+" score "+total);
            if(total>winner){
                winner=total;
                winnername=name[x];
            }
        }
        
        System.out.println(winnername+" is the winner");
    }
}
