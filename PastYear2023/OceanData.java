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

public class OceanData {

    public static void main(String[] args) {
        String inputFile = "ocean_data.csv";
        DataBuoy[] data = new DataBuoy[25];
        float avg_water_temp;

        loadData(inputFile, data);
        showData(data);

        avg_water_temp = calculateAvgWaterTemp(data);
        System.out.println("\nAverage water temperature is " + avg_water_temp);

        printMap(data, avg_water_temp);
    }

    public static void loadData(String fileName, DataBuoy[] data) {
        try {
            BufferedReader input = new BufferedReader(new FileReader("ocean_data.csv"));
            String object;
            int size = 0;
            while ((object = input.readLine()) != null) {
                size++;
            }
            input.close();
            DataBuoy[] Buoys = data;

            input = new BufferedReader(new FileReader("ocean_data.csv"));
            for (int i = 0; i < size;) {
                while ((object = input.readLine()) != null) {
                    String[] str = object.split(",");
                    Buoys[i] = new DataBuoy(str[0],
                            Integer.parseInt(str[1]),
                            Integer.parseInt(str[2]),
                            Double.parseDouble(str[3]),
                            Double.parseDouble(str[4]));
                    i++;
                }
            }
            input.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void showData(DataBuoy[] buoy) {
        System.out.printf("%-20s %-10s %-10s %-10s %-10s\n", "buoy_id", "lat",
                "long", "air_t", "water_t");
        for (DataBuoy buoys : buoy) {
            System.out.println(buoys);
        }
    }

    public static float calculateAvgWaterTemp(DataBuoy[] data) {
        float sum = 0;
        for (DataBuoy water : data) {
            sum += water.getWaterTemp();
        }
        return sum / 25;
    }

    public static void printMap(DataBuoy[] data, float avg) {
        System.out.println("\nHeat Map of water temperature");
        for (int i = 10; i > -11; i--) {
            for (int j = -10; j < 11; j++) {
                boolean same = true;
                for (DataBuoy buoy : data) {
                    if (buoy.getLatitude() == i && buoy.getLongitude() == j) {
                        same = false;
                        double temp = buoy.getWaterTemp();
                        System.out.print(Symbol(temp, avg));
                    }
                }
                if (same) {
                    System.out.print("~");
                }
            }
            System.out.println("");
        }
    }

    public static char Symbol(double temp, float avg) {
        if (temp > avg) {
            return 'H';
        } else if (temp < avg) {
            return 'C';
        } else {
            return 'A';
        }
    }
}
