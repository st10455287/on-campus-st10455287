package Question2;

public class RoadAccidentReport extends RoadAccidents {
    public RoadAccidentReport(String vehicleType, String city, int accidentsTotal) {
        super(vehicleType, city, accidentsTotal);
    }

    @Override
    public void setVehicleType(String vehicleType) {
        super.setVehicleType(vehicleType);
    }

    @Override
    public void setCity(String city) {
        super.setCity(city);
    }

    @Override
    public void setAccidentsTotal(int accidentsTotal) {
        super.setAccidentsTotal(accidentsTotal);
    }

    @Override
    public String getAccidentVehicleType() {
        return vehicleType;
    }

    @Override
    public int getAccidentTotal() {
        return accidentsTotal;
    }

    public void printAccidentReport() {
        System.out.println("\nVEHICLE ACCIDENT REPORT");
        System.out.println("************************");
        System.out.printf("VEHICLE TYPE: %s\n", vehicleType);
        System.out.printf("CITY : %s\n", city);
        System.out.printf("ACCIDENT TOTAL: %s\n", accidentsTotal);
        System.out.println("************************");
    }
}
