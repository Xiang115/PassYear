/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2017_1;

/**
 *
 * @author Goh
 */
public class Complex {
    private int a; //real
    private int b;   //imaginary
    
    public Complex(){
        this.a=0;
        this.b = 0;
    }
    
    public Complex(int a,int b){
        this.a = a;
        this.b = b;
    }
    
    public void addComplexNum(Complex another){
        int x = a;
        int y = b;
        x = a + another.getReal();
        y = b + another.gerImaginary();
        System.out.printf("(%d + %di)\n",x,y);
    }
    
    public void SubtractComplexNum(Complex another) {
        int x = a;
        int y = b;
        x = a - another.getReal();
        y = b - another.gerImaginary();
        System.out.printf("(%d + %di)\n",x,y);
    }
    
    public int getReal(){
        return a;
    }
    
    public int gerImaginary(){
        return b;
    }
    
    @Override
    public String toString(){
        return String.format("(%d + %di)",a,b);
    }
}
