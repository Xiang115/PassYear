/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ2020_Q4;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
/**
 *
 * @author HP
 */
public class Q4 {
    public static void main(String[] args) {
        int rec=0;
        int numofjobs=0;
        String[][] records=new String[100][22];
        
        try{
            Scanner read=new Scanner(new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\sampleLog.txt"));
            while(read.hasNextLine()){
                rec++;
                read.nextLine();
            }
            records=new String[rec][22];
            Scanner get=new Scanner(new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\sampleLog.txt"));
            int i=0;
            while(get.hasNextLine()){
                records[i]=get.nextLine().split(" ");
                if(records[i][1].contains("user=") && records[i][1].contains(";S;"))
                    numofjobs++;
                i++;
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
        System.out.println("Reading from log file...");
        System.out.println("******************************************");
        System.out.println("Records read from log file");
        
        for(int n=0;n<rec;n++){
            System.out.printf("Record %d:\n",n+1);
            for(String item:records[n]){
                if(!item.isBlank())
                    System.out.printf("\t%s\n",item);
            }
            System.out.println();
        }
        System.out.println("Total records read: "+rec);
        System.out.println("******************************************");
        System.out.println("Print user submission stat");
        System.out.println();
        System.out.printf("User\t\tJobssubmitted\n");
        System.out.printf("----\t\t-------------\n");
        
        String[] users=new String[numofjobs];
        int[] userjobs=new int[numofjobs];
        int idx = 0;
        for(int i=0; i<rec; i++){
            if (records[i][1].contains("user") && records[i][1].contains(";S;") ){
                String user = records[i][1].substring(records[i][1].indexOf("user")+5);
                boolean found = false;
                for(int j=0; j<idx; j++){
                    if (users[j].equals(user)){
                        userjobs[j]++;
                        found = true;
                    }
                }
                if (!found){
                    users[idx] = user;
                    userjobs[idx++]++;
                }
            }
        }
        int numOfUser = 0; 
        for(int i=0; i<userjobs.length; i++){
            if (userjobs[i] !=0) 
                numOfUser++;
        }
        
        for(int i=0; i<numOfUser; i++){
            System.out.println(users[i] + "\t\t\t" + userjobs[i]);
        }
        System.out.println();
        System.out.println("**********************************************");
        System.out.println("Print jobs status");
        System.out.println();
        
        System.out.println("Job ID\tSubmitted (queue)\tStarted (start time)\tExpired (end time/error)");
        System.out.printf("------\t-----------------\t--------------------\t------------------------\n");
        
        for(int i=0; i<rec; i++){
            if (records[i][1].contains(";Q;")){ // Queue
                 String jobID = records[i][1].substring(records[i][1].indexOf(";Q;")+3, records[i][1].indexOf(".ce2.dicc"));
                 String queue = records[i][1].substring(records[i][1].indexOf("queue=")+6);
                 boolean started = false;
                 String startTime = "";
                 for(int j=i+1; j<rec;j++){
                     if (records[j][1].contains(";S;") && records[j][1].contains(jobID)){
                         started = true;
                         startTime = records[j][8].substring(6);
                         boolean ended = false;
                         String exitStatus = "";
                         for(int k = j+1; k<rec; k++){
                             if (records[k][1].contains(";E;") && records[k][1].contains(jobID)){
                                 ended = true;
                                 exitStatus = records[k][records[k].length-5].substring(12);
                                 if (exitStatus.equals("1")){ // ended successfully
                                     exitStatus = records[k][records[k].length-6].substring(4);
                                 }else{ // Error
                                     exitStatus = "Error: Exit Status " + exitStatus;
                                 }
                             }
                         }
                         if (!ended){
                             exitStatus = "null";
                         }
                         System.out.printf("%s\t%-5s (%s)\t%10s (%s)\t%s\n", jobID, "Y",queue,"Y", startTime, exitStatus);
                     }
                 }
            }
        }
    }
}
