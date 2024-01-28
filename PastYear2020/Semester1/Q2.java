/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2020_1;

/**
 *
 * @author Goh
 */
import java.util.*;

public class Q2 {

    static Map<Character, Integer> direction = Map.of(
            'N', 1,
            'S', -1,
            'E', 1,
            'W', -1);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char Direction1, Direction2, Direction3, Direction4;
        double Latitude1, Latitude2, Longitude1, Longitude2;
        int Degree, Minute, Second;
        double Distance;

        System.out.println("Enter location 1");
        System.out.print("Enter Direction: {N,S,E,W}: ");
        Direction1 = sc.next().charAt(0);
        System.out.print("Enter Degree, Minute and Second : ");
        Degree = sc.nextInt();
        Minute = sc.nextInt();
        Second = sc.nextInt();
        Latitude1 = getDegree(Direction1, Degree, Minute, Second);

        System.out.print("Enter Direction: {N,S,E,W}: ");
        Direction2 = sc.next().charAt(0);
        System.out.print("Enter Degree, Minute and Second : ");
        Degree = sc.nextInt();
        Minute = sc.nextInt();
        Second = sc.nextInt();
        Longitude1 = getDegree(Direction2, Degree, Minute, Second);

        System.out.println("Enter location 2");
        System.out.print("Enter Direction: {N,S,E,W}: ");
        Direction3 = sc.next().charAt(0);
        System.out.print("Enter Degree, Minute and Second : ");
        Degree = sc.nextInt();
        Minute = sc.nextInt();
        Second = sc.nextInt();
        Latitude2 = getDegree(Direction3, Degree, Minute, Second);

        System.out.print("Enter Direction: {N,S,E,W}: ");
        Direction4 = sc.next().charAt(0);
        System.out.print("Enter Degree, Minute and Second : ");
        Degree = sc.nextInt();
        Minute = sc.nextInt();
        Second = sc.nextInt();
        Longitude2 = getDegree(Direction4, Degree, Minute, Second);
        
        Distance = calcDistance(Latitude1, Longitude1, Latitude2, Longitude2);

        System.out.printf("Location 1 : %.6f Latitude , %.6f Longitude\n",Latitude1,Longitude1);
        System.out.printf("Location 2 : %.6f Latitude , %.6f Longitude\n",Latitude2,Longitude2);
        System.out.printf("Distance : %.2f KM\n",Distance);
    }

    public static double getDegree(char a, int d, int min, int sec) {
        return (direction.get(a) * (d + (double) (min * 60 + sec) / 3600));
    }
    
    public static double calcDistance(double a,double b, double c,double d){
        double DiffLatitude = c - a;
        double DiffLongitude = d - b;
        double A;
        A = Math.pow(Math.sin(Math.toRadians(DiffLatitude/2)),2) + (Math.cos(Math.toRadians(a)))*(Math.cos(Math.toRadians(c)))*
                (Math.pow(Math.sin(Math.toRadians(DiffLongitude/2)),2));
        double C = 2*(Math.atan2(Math.sqrt(A), Math.sqrt(1-A)));
        double D = 6371*C;
        return D;
    }
}
