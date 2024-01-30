/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pastyear_2023_1;

/**
 *
 * @author Goh
 */
public class Node {
    private String name;
    private String Partitions;
    private int CPUTot;
    private int CPUAlloc;
    private int RealMemory;
    private int AllocMem;
    
    public Node(String a, String b, int c, int d, int e, int f){
        this.name = a;
        this.Partitions = b;
        this.CPUTot = c;
        this.CPUAlloc = d;
        this.RealMemory = e;
        this.AllocMem = f;
    }
    
    public int FreeCPU(){
        return this.CPUTot - this.CPUAlloc;
    }
    
    public int FreeMemory(){
        return (this.RealMemory - this.AllocMem)/1000;
    }
    
    public double calcRatio(){
        double ratio = ((double) FreeCPU() / this.CPUTot) - ((double) FreeMemory() / (this.RealMemory / 1000));
        
        return Math.max(ratio, -ratio);
    }
    
    @Override
    public String toString(){
        return String.format("|%-15s %-20s %2d / %2d  %4dG / %4dG %-10.3f|",this.name,
                this.Partitions,FreeCPU(),this.CPUTot,FreeMemory(),this.RealMemory/1000,calcRatio());
    }
}
