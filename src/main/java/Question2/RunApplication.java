package Question2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunApplication {
    public static void main(String[] args) throws IOException {
        // i use a buffered reader as it is safer
        BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));

        // make RoadAccidentReport
        RoadAccidentReport rar = new RoadAccidentReport("", "", 0);

        // get info from user
        System.out.print("Enter the accident vehicle type: ");
        String vehicletype = rdr.readLine();
        rar.setVehicleType(vehicletype);

        // get city
        System.out.print("Enter the city for the vehicle accidents: ");
        String city = rdr.readLine();
        rar.setCity(city);

        // get number of accidents
        System.out.printf("Enter the total %s accidents for %s: ", rar.getAccidentVehicleType(), rar.getCity());
        int numAccidents = Integer.parseInt(rdr.readLine());
        rar.setAccidentsTotal(numAccidents);

        rar.printAccidentReport();
    }
}
