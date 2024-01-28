/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ2019_Q2;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author HP
 */
public class Q2 {
    public static void main(String[] args) {
        GenerateMatrix();
    }   
    
    public static void GenerateMatrix(){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        boolean within=true;
        int N=0;
        System.out.print("Enter N : ");
        N=sc.nextInt();
        int[][] matrixA=new int[N][N];
        int[][] matrixB=new int[N][N];
        System.out.println("Matrix A");
        for(int i=0;i<matrixA.length;i++){
            for(int j=0;j<matrixA[i].length;j++)
                matrixA[i][j]=r.nextInt(10);
        }
        displayMatrix(matrixA);
        System.out.println("Matrix B");
        for(int i=0;i<matrixB.length;i++){
            for(int j=0;j<matrixB[i].length;j++){
                matrixB[i][j]=r.nextInt(10);
            }
        }
        displayMatrix(matrixB);
        addMatrices(matrixA,matrixB,N);
        MultiplyMatrices(matrixA,matrixB,N);
    }
    
    public static void displayMatrix(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    static void addMatrices(int[][] a,int[][] b, int num){
        int[][] c=new int[num][num];
        for(int x=0;x<c.length;x++){
            for(int y=0;y<c[x].length;y++){
                c[x][y]=a[x][y]+b[x][y];
            }
        }
        System.out.println("Matrix A + B");
        displayMatrix(c);
    }
    
    static void MultiplyMatrices(int[][]a,int[][] b,int num){
        int[][] c=new int[num][num];
        for(int x=0;x<c.length;x++){
            for(int y=0;y<c[x].length;y++){
                for(int z=0;z<num;z++)
                    c[x][y]+=a[x][z]*b[z][y];
            }
        }
        System.out.println("Matrix A + B");
        displayMatrix(c);
    }
}
