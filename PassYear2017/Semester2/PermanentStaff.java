/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2017_2;

/**
 *
 * @author Goh
 */
import java.util.*;

public class PermanentStaff extends Staff {

    private String grade;
    private Map<String, Integer> salaryTable = Map.of(
            "EM01", 7000,
            "EM02", 5000,
            "EM03", 3000,
            "EM04", 1000);

    public PermanentStaff(String name, String ID, String grade) {
        super(name, ID);
        this.grade = grade;
    }

    public int getSalary(){
        return salaryTable.get(grade);
    }
    
    @Override
    public String toString(){
        return String.format("%s\n"
                + "Grade: %s\n"
                + "Salary: %d\n",super.toString(), grade,getSalary());
    }
}
