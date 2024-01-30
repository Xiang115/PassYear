/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pastyear_2023_1;

/**
 *
 * @author Goh
 */
import java.util.*;
import java.io.*;

public class Q4 {

    public static void main(String[] args) {
        String file = "nodelist.txt";
        int size = 0;
        try {
            Scanner sc = new Scanner(new FileReader(file));
            while (sc.hasNextLine()) {
                if (sc.nextLine().contains("NodeName")) {
                    size++;
                }
            }
            sc.close();
            String[][] nodes = new String[size][6];
            Node[] node = new Node[size];

            sc = new Scanner(new FileReader(file));
            int i = 0;
            String line;
            while (sc.hasNextLine()) {
                do {
                    line = sc.nextLine();
                    String[] str = line.split(" ");
                    for (String find : str) {
                        if (find.contains("Node")) {
                            nodes[i][0] = find.substring(find.indexOf("NodeName=") + 14);
                        }
                        if (find.contains("Partitions")) {
                            nodes[i][1] = find.substring(find.indexOf("Partitions=") + 11);
                        }
                        if (find.contains("CPUTot")) {
                            nodes[i][2] = find.substring(find.indexOf("CPUTot=") + 7);
                        }
                        if (find.contains("CPUAlloc")) {
                            nodes[i][3] = find.substring(find.indexOf("CPUAlloc=") + 9);
                        }
                        if (find.contains("RealMemory")) {
                            nodes[i][4] = find.substring(find.indexOf("RealMemory=") + 11);
                        }
                        if (find.contains("AllocMem")) {
                            nodes[i][5] = find.substring(find.indexOf("AllocMem=") + 9);
                        }
                    }
                } while (sc.hasNextLine() && !line.equals(""));

                node[i] = new Node(nodes[i][0],
                        nodes[i][1],
                        Integer.parseInt(nodes[i][2]),
                        Integer.parseInt(nodes[i][3]),
                        Integer.parseInt(nodes[i][4]),
                        Integer.parseInt(nodes[i][5]));
                i++;
            }
            
            System.out.printf("+%-65s+\n","-".repeat(65));
            System.out.printf("|%-16s%-23s%-10s%-13s%-10s|\n","Node","Partitions","CPU",
                    "MEMORY","RATIO");
            System.out.printf("+%-65s+\n","-".repeat(65));
            for (Node nodee : node) {
                System.out.println(nodee);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (Exception e) {
            System.out.println("Problem with input");
        }
    }
}
