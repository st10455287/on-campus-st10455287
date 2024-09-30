package org.Question1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1Main {
    public static void main(String[] args) throws IOException {
        // I use a buffered reader instead of a scanner as it is safer
        BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));

        // name of the cities
        String citys[] = {"Cape Town", "Johannesburg", "Port Elizabeth"};

        // array 1 is car accidents array 2 is motorbike accidents
        int accidentsPerCity[][] = new int[2][3];

        for (int i = 0; i < citys.length; i++) {
            // prompt user for car accidents
            System.out.printf("Enter the number of car accidents for %s: ", citys[i]);
            // use tmp to parse the int from the user
            int tmp = Integer.parseInt(rdr.readLine());
            accidentsPerCity[0][i] = tmp;

            // prompt user for motor bike accidents
            System.out.printf("Enter the number of motor bike accidents for %s: ", citys[i]);
            // use tmp to parse the int from the user
            tmp = Integer.parseInt(rdr.readLine());
            accidentsPerCity[1][i] = tmp;
        }

        // output report
        System.out.println("----------------------------------------------------------------");
        System.out.println("ROAD ACCIDENT REPORT");
        System.out.println("----------------------------------------------------------------");
        System.out.println("                         CAR     MOTOR BIKE");

        // total accidents per city
        int totals[] = new int[3];
        // for formating

        String indentsCars[] = {"                ", "             ", "           "};
        String indentsMotor[] = {"     ", "     ", "     "};
        // city info
        for (int i = 0; i < 3; i++) {
            String cars = indentsCars[i] + String.valueOf(accidentsPerCity[0][i]);
            String motorbikes = indentsMotor[i] + String.valueOf(accidentsPerCity[1][i]);
            System.out.printf("%s%s%s\n", citys[i], cars, motorbikes);
            totals[i] = accidentsPerCity[0][i] + accidentsPerCity[1][i];
        }

        System.out.println("----------------------------------------------------------------");
        System.out.println("ROAD ACCIDENT TOTALS FOR EACH CITY");

        // for formating
        String indents[] = {"       ", "    ","  "};
        // find the city with the most accidents
        int max = -1;
        int idx = 0;
        // show totals
        for (int i = 0; i < 3; i++) {
            System.out.printf("%s%s%d\n", citys[i], indents[i], totals[i]);
            if (totals[i] > max) {
                max = totals[i];
                idx = i;
            }
        }

        System.out.printf("\nCITY WITH THE MOST VEHICLE ACCIDENTS: %s\n", citys[idx]);
        System.out.println("----------------------------------------------------------------");
    }
}