/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ2022_4;

/**
 *
 * @author HP
 */
public class Nodes {
    private int CPUAlloc;
    private int CPUTot;
    private int RealMemory;
    private int AllocMem;
    private String Partition;
    private String NodeName;
    
    public Nodes(String NodeName,int CPUTot,int CPUAlloc,int RealMemory,int AllocMem,String Partition){
        this.NodeName=NodeName;
        this.Partition=Partition;
        this.AllocMem=AllocMem;
        this.RealMemory=RealMemory;
        this.CPUAlloc=CPUAlloc;
        this.CPUTot=CPUTot;
    }
    
    public int getfreeCPU(){
        return CPUTot-CPUAlloc;
    }
    
    public int getfreeRAMinGB(){
        return (RealMemory-AllocMem)/1000;
    }
    
    public int getRealMemoryinGB(){
        return RealMemory/1000;
    }
    
    public double getRatio(){
        return Math.abs((double)getfreeCPU()/CPUTot-(double)getfreeRAMinGB()/getRealMemoryinGB());
    }
    
    @Override
    public String toString(){
        return String.format("%-8s%-14s%3d/%-6d%3dG/%3dG%9.3f", NodeName,Partition,getfreeCPU(),CPUTot,getfreeRAMinGB(),
                (RealMemory/1000),getRatio());
    }
}
