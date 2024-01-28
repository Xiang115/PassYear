/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2020_1;

/**
 *
 * @author Goh
 */
public class Job {
    private String Name;
    private int NoTask;
    private int Memory;

    public Job(String name, int noTask, int memory){
        this.Name = name;
        this.NoTask = noTask;
        this.Memory = memory;
    }
    
    public String getName() {
        return Name;
    }

    public int getNoTask() {
        return NoTask;
    }

    public int getMemory() {
        return Memory;
    }
    
    @Override
    public String toString(){
        return String.format("Job Name : %s Memory = %dGB Number Of Task = %d",this.Name,this.Memory,this.NoTask);
    }
}
