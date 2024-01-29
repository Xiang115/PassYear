/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ2022_4;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
/**
 *
 * @author HP
 */
public class Q4 {
    public static void main(String[] args) {
        String file="C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\nodelist.txt";
        try{
            Scanner read=new Scanner(new FileInputStream(file));
            int numberofnodes=0;
            while(read.hasNextLine()){
                if(read.nextLine().contains("NodeName"))
                    numberofnodes++;
            }
            read.close();
            
            read=new Scanner(new FileInputStream(file));
            Nodes[] nodes=new Nodes[numberofnodes];
            for(int i=0;read.hasNextLine();i++){
                String[] elements=new String[6];
                String line;
                
                do{
                    line=read.nextLine();
                    for(String arg: line.split(" ")){
                        if(arg.startsWith("NodeName"))
                            elements[0]=arg.split("=")[1];
                        else if(arg.startsWith("CPUTot"))
                            elements[1]=arg.split("=")[1];
                        else if(arg.startsWith("CPUAlloc"))
                            elements[2]=arg.split("=")[1];
                        else if(arg.startsWith("RealMemory"))
                            elements[3]=arg.split("=")[1];
                        else if(arg.startsWith("AllocMem"))
                            elements[4]=arg.split("=")[1];
                        else if(arg.startsWith("Partitions"))
                            elements[5]=arg.split("=")[1];
                    }
                }while(read.hasNextLine() && !line.equals(""));
                Nodes node=new Nodes(elements[0],Integer.parseInt(elements[1]),Integer.parseInt(elements[2]),Integer.parseInt(elements[3]),
                        Integer.parseInt(elements[4]),elements[5]);
                nodes[i]=node;
            }
            read.close();
            
            System.out.println("+" + "-".repeat(52) + "+");
            System.out.println("| Node    Partitions      CPU       MEMORY     RATIO |");
            System.out.println("+" + "-".repeat(52) + "+");
            for (var node : nodes)
                System.out.println("| " + node + " |");
            System.out.println("+" + "-".repeat(52) + "+");
        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
    }
}
