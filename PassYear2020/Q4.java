/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2020_1;

/**
 *
 * @author Goh
 */
import java.util.*;
import java.io.*;

public class Q4 {

    static HashMap<String, Integer> name = new HashMap<>();
    static HashMap<Integer, JobStatus> status = new HashMap<>();

    public static void main(String[] args) {
        int size = 0;
        try {
            BufferedReader input = new BufferedReader(new FileReader("sampleLog.txt"));
            String object;
            while ((object = input.readLine()) != null) {
                size++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException ex) {
            System.out.println("Problem with input");
        }

        String[][] records = new String[size][];
        try {
            BufferedReader input = new BufferedReader(new FileReader("sampleLog.txt"));
            for (int i = 0; i < size; i++) {
                records[i] = input.readLine().split(" ");
            }
            input.close();

            System.out.println("Reading from log file...");
            for (int i = 0; i < 30; i++) {
                System.out.print("*");
            }
            System.out.println("\nRecords read from file");

            for (int i = 0; i < records.length; i++) {
                System.out.printf("\nRecord %d\n", i + 1);
                for (int j = 0; j < records[i].length; j++) {
                    System.out.println(records[i][j]);
                }
            }

            System.out.println("total records read: " + size + "\n");

            for (int i = 0; i < 40; i++) {
                System.out.print("*");
            }
            System.out.println("\nPrint user submission stat\n");
            System.out.printf("%-20s %-30s\n", "User", "Jobs Submitted");
            System.out.printf("%-20s %-30s\n", "-".repeat(5), "-".repeat(20));

            FindUserSubmission(records);
            for (Map.Entry<String, Integer> e : name.entrySet()) {
                System.out.printf("%-20s %-30s\n", e.getKey(), e.getValue());
            }

            System.out.println("");
            for (int i = 0; i < 40; i++) {
                System.out.print("*");
            }

            System.out.println("\nPrint jobs status\n");
            System.out.printf("%-10s %-30s %-30s %-30s\n", "Job ID", "Submitted (queue)", "Started (start time)", "Exited (end time/error)");
            System.out.printf("%-10s %-30s %-30s %-30s\n", "-".repeat(6), "-".repeat(20), "-".repeat(25), "-".repeat(25));

            FindUserStatus(records);
            FindUserStatusE(records);

            for (Map.Entry<Integer, JobStatus> statu : status.entrySet()) {
                System.out.printf("%-10s Y (%s)%25s Y(%s)%20s %-30s\n", statu.getKey(),
                        statu.getValue().getQue(),
                        " ".repeat(20),
                        statu.getValue().getStatus(),
                        " ".repeat(20),
                         statu.getValue().getExit());
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException ex) {
            System.out.println("Problem with input");
        }
    }

    public static boolean FindQ(String[] record) {
        return record.length > 2 && record.length < 16;
    }

    public static boolean FindE(String[] record) {
        return record.length > 16;
    }

    public static void FindUserSubmission(String[][] records) {
        for (int i = 0; i < records.length; i++) {
            if (FindQ(records[i])) {
                String[] str = records[i][1].split(";");
                String user = str[3].substring(5);
                if (!(name.containsKey(user))) {
                    name.put(user, 1);
                } else {
                    int current = name.get(user) + 1;
                    name.put(user, current);
                }
            }
        }
    }

    public static void FindUserStatus(String[][] records) {
        String que;
        for (int i = 0; i < records.length; i++) {
            if (FindQ(records[i])) {
                String[] str = records[i][1].split(";");
                int ID = Integer.parseInt(str[2].substring(0, 5));
                if (!(status.containsKey(ID))) {
                    status.put(ID, new JobStatus());
                }
                que = records[i][4].substring(6);
                if (status.containsKey(ID)) {
                    status.get(ID).setque(que);
                }
            }
        }
    }

    public static void FindUserStatusE(String[][] records) {
        String start, exit;
        int check;
        for (int i = 0; i < records.length; i++) {
            if (FindE(records[i])) {
                String[] str = records[i][1].split(";");
                int ID = Integer.parseInt(str[2].substring(0, 5));
                start = records[i][8].substring(6);
                if (status.containsKey(ID)) {
                    status.get(ID).setStatus(start);
                }
                if (status.containsKey(ID)) {
                    check = Integer.parseInt(records[i][17].substring(12));
                    if (check != 1) {
                        exit = records[i][17].replace("_", "").replace("=", "");
                        status.get(ID).setExited(exit);
                    } else {
                        exit = records[i][16].substring(4);
                        status.get(ID).setExited(exit);
                    }
                }
            }
        }
    }
}
