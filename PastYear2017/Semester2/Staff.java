/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2017_2;

/**
 *
 * @author Goh
 */
public class Staff {
    private String name;
    private String IC;
    
    public Staff(String name, String IC){
        this.name = name;
        this.IC = IC;
    }
    
    @Override
    public String toString(){
        return String.format("Full Name: %s\n"
                + "IC: %s", name,IC);
    }
}
