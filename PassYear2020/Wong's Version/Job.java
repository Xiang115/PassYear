/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ2020_Q5;

/**
 *
 * @author HP
 */
public class Job {
    private String jobname;
    private int numoftasks;
    private int memory;
    
    public Job(String jobname,int numoftasks,int memory){
        this.jobname=jobname;
        this.numoftasks=numoftasks;
        this.memory=memory;
    }
    
    protected String getjobname(){
        return jobname;
    }
    
    protected int getnumoftasks(){
        return numoftasks;
    }
    
    protected int getmemory(){
        return memory;
    }

    @Override
    public String toString(){
        return "Job name : "+jobname+" Memory = "+memory+"GB Number of tasks = "+numoftasks;
    }
}
