package sky.pro.java.course2.hw16.Transport;

public class Bus extends Transport {
    private String departureStationName;
    private String endingStation;
    private int tripPrice;

    public Bus(String brand, String model, int year, String country, String color, int maxSpeed, String departureStationName, String endingStation, int tripPrice) {
        super(brand, model, year, country, color, maxSpeed);
        this.departureStationName = validateString(departureStationName);
        this.endingStation = validateString(endingStation);
        this.tripPrice = (tripPrice <= 500) ? 3000 : tripPrice;
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

    public int getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(int tripPrice) {
        this.tripPrice = (tripPrice <= 500) ? 3000 : tripPrice;
    }

    @Override
    public void refill() {
        System.out.println("Заправляемся бензином или дизелем");
    }

    @Override
    public String toString() {
        return "Автобус " + getBrand() + ", модель " + getModel() + ", " + getYear() + " года выпуска, страна " + getCountry() + ", скорость передвижения " + getMaxSpeed() + " км/ч, отходит от " + departureStationName + " и слудует до " + endingStation + ". Цена поездки " + tripPrice + " рублей.";
    }
}
