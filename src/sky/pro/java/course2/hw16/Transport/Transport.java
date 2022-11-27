package sky.pro.java.course2.hw16.Transport;

abstract public class Transport {
    private String brand;
    private String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;

    private static String noInformation = "< Информация не указана >";

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = noInformation;
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = noInformation;
        } else {
            this.model = model;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = noInformation;
        } else {
            this.country = country;
        }
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = noInformation;
        } else {
            this.color = color;
        }
        if (maxSpeed <= 0) {
            this.maxSpeed = 120;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = noInformation;
        } else {
            this.color = color;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            this.maxSpeed = 120;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }
    public static String getNoInformation() {
        return noInformation;
    }
    public String validateString(String s) {
        return s != null && s.isEmpty() && s.isBlank() ? "< Информация не указана >" : s;
    }
    public abstract void refill();
}