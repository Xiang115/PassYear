/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2017_2;

/**
 *
 * @author Goh
 */

public class PartTimeStaff extends Staff{
    private int workHour;
    
    public PartTimeStaff(String name, String ID, int hour){
        super(name,ID);
        this.workHour = hour;
    }
    
    public int getSalary(){
        return workHour*40;
    }
    
    @Override
    public String toString(){
        return String.format("%s\n"
                + "Number of working hours: %d\n"
                + "Salary: RM %d\n",super.toString(), workHour,getSalary());
    }
}
