/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ2020_Q2;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Q2 {
    static int location1[][]=new int[2][4],location2[][]=new int[2][4];
    static double degree1[]=new double[2],degree2[]=new double[2];
    
    public static void main(String[] args) {
        getinput();
        ConvertToDegree();
        
        System.out.printf("Location 1 : %2.6f Latitude, %2.6f Longitude\n",degree1[0],degree1[1]);
        System.out.printf("Location 2 : %2.6f Latitude, %2.6f Longitude\n",degree2[0],degree2[1]);
        System.out.printf("Distance : %4.2f KM\n",CalculateDistance());
    }
    
    static void getinput(){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Location 1");
        System.out.print("Enter Direction: [N,S,E,W]: ");
        char direct1=sc.next().charAt(0);
        if(direct1=='N')
            toPositive(0,1);
        System.out.print("Enter Degree, Minute and Second : ");
        for(int i=1;i<=3;i++)
            location1[0][i]=sc.nextInt();

        System.out.print("Enter Direction: [N,S,E,W]: ");
        char direct2=sc.next().charAt(0);
        if(direct2=='E')
            toPositive(1,1);
        System.out.print("Enter Degree, Minute and Second : ");
        for(int i=1;i<=3;i++)
            location1[1][i]=sc.nextInt();
        
        System.out.println("Enter Location 2");
        System.out.print("Enter Direction: [N,S,E,W]: ");
        char direct3=sc.next().charAt(0);
        if(direct3=='N')
            toPositive(0,2);
        System.out.print("Enter Degree, Minute and Second : ");
        for(int i=1;i<=3;i++)
            location2[0][i]=sc.nextInt();

        System.out.print("Enter Direction: [N,S,E,W]: ");
        char direct4=sc.next().charAt(0);
        if(direct4=='E')
            toPositive(1,2);
        System.out.print("Enter Degree, Minute and Second : ");
        for(int i=1;i<=3;i++)
            location2[1][i]=sc.nextInt();
    }
    
    static void toPositive(int type, int location){
        if(location==1)
            location1[type][0]=1;
        else
            location2[type][0]=1;
    }
    
    static void ConvertToDegree(){
        for(int i=0;i<2;i++){
            int degree=location1[i][1];
            int minute=location1[i][2];
            int seconds=location1[i][3];
            degree1[i]=degree+(double)(minute*60+seconds)/3600;
            if(location1[i][0]==0)
                degree1[i]*=-1;
        }
        
        for(int i=0;i<2;i++){
            int degree=location2[i][1];
            int minute=location2[i][2];
            int seconds=location2[i][3];
            degree2[i]=degree+(double)(minute*60+seconds)/3600;
            if(location2[i][0]==0)
                degree2[i]*=-1;
        }
    }
    
    static double CalculateDistance(){
        double lat1=Math.toRadians(degree1[0]);
        double long1=Math.toRadians(degree1[1]);
        double lat2=Math.toRadians(degree2[0]);
        double long2=Math.toRadians(degree2[1]);
        
        double a=Math.sin((lat1-lat2)/2)*Math.sin((lat1-lat2)/2)+Math.cos(lat1)*Math.cos(lat2)
                *Math.sin((long1-long2)/2)*Math.sin((long1-long2)/2);
        double c=2*Math.atan2(Math.sqrt(a),Math.sqrt(1-a));
        
        return 6371*c;
    }
}
