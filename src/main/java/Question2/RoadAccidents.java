package Question2;

public abstract class RoadAccidents implements IRoadAccidents {
    protected String vehicleType;
    protected String city;
    protected int accidentsTotal;

    public RoadAccidents(String vehicleType, String city, int accidentsTotal) {
        this.vehicleType = vehicleType;
        this.city = city;
        this.accidentsTotal = accidentsTotal;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getCity() {
        return city;
    }

    public int getAccidentsTotal() {
        return accidentsTotal;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAccidentsTotal(int accidentsTotal) {
        this.accidentsTotal = accidentsTotal;
    }
}
