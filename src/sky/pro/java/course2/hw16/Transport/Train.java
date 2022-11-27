package sky.pro.java.course2.hw16.Transport;

public class Train extends Transport {
    private int tripPrice;
    private int travelTime;
    private String departureStationName;
    private String endingStation;
    private int numberOfWagons;

    public Train(String brand, String model, int year, String country, String color, int maxSpeed, int tripPrice, int travelTime, String departureStationName, String endingStation, int numberOfWagons) {
        super(brand, model, year, country, color, maxSpeed);
        this.tripPrice = (tripPrice <= 500) ? 3000 : tripPrice;
        this.travelTime = (travelTime <= 0) ? 2 : travelTime;
        this.departureStationName = validateString(departureStationName);
        this.endingStation = validateString(endingStation);
        this.numberOfWagons = (numberOfWagons <= 0) ? 10 : numberOfWagons;
    }

    public int getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(int tripPrice) {
        this.tripPrice = (tripPrice <= 500) ? 3000 : tripPrice;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = (travelTime <= 0) ? 2 : travelTime;
    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public void setDepartureStationName(String departureStationName) {
        this.departureStationName = validateString(departureStationName);
    }

    public String getEndingStation() {
        return endingStation;
    }

    public void setEndingStation(String endingStation) {
        this.endingStation = validateString(endingStation);
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = (numberOfWagons <= 0) ? 10 : numberOfWagons;
    }
    @Override
    public void refill() {
        System.out.println("Заправляемся дизелем");
    }

    @Override
    public String toString() {
        return "Поезд " + getBrand() + ", модель " + getModel() + ", " + getYear() + " года выпуска, страна " + getCountry() + ", скорость передвижения " + getMaxSpeed() + " км/ч, отходит от " + departureStationName + " и слудует до " + endingStation + ". Цена поездки " + tripPrice + " рублей, в поезде " + numberOfWagons + " вагонов.";
    }
}