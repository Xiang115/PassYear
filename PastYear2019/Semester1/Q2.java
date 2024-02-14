/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pastyear_2019_1;

/**
 *
 * @author Goh
 */
import java.util.Scanner;
import java.util.Random;

public class Q2 {

    static final int MAX = 10;
    static int[][] matA;
    static int[][] matB;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Enter N: ");
        N = sc.nextInt();

        generateMatrix(N, r);
        DisplayMatrix();
        AdditionMatrix();
        MultiplicationMatrix();
    }

    public static void generateMatrix(int N, Random r) {
        matA = new int[N][N];
        matB = new int[N][N];
        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matA[i].length; j++) {
                matA[i][j] = r.nextInt(MAX);
                matB[i][j] = r.nextInt(MAX);
            }
        }
    }

    public static void DisplayMatrix() {
        System.out.println("Matrix A");
        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matA[i].length; j++) {
                System.out.print(matA[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Matrix B");
        for (int i = 0; i < matB.length; i++) {
            for (int j = 0; j < matB[i].length; j++) {
                System.out.print(matB[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void AdditionMatrix() {
        System.out.println("Matrix A + B");
        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matA[i].length; j++) {
                System.out.print((matA[i][j] + matB[i][j]) + " ");
            }
            System.out.println("");
        }
    }

    public static void MultiplicationMatrix() {
        int[][] c = new int[N][N];
        System.out.println("Matrix A X B");
        for (int i = 0; i < matA.length; i++) { //i=0
            for (int j = 0; j < matA[i].length; j++) {  //j=0
                c[i][j] = 0;
                for(int k=0; k<c.length;k++){
                    c[i][j] += matA[i][k]*matB[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
