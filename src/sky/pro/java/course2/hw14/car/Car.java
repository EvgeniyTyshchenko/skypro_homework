package sky.pro.java.course2.hw14.car;

import java.util.Objects;

public class Car {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private final String color;
    private final int year;
    private final String country;
    private final String noInformation = "< Информация не указана >";

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == null || brand.isEmpty()) {
            this.brand = noInformation;
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = noInformation;
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country.isEmpty()) {
            this.country = noInformation;
        } else {
            this.country = country;
        }
    }
    @Override
    public String toString() {
        return brand + " " + model + ", " + year + " год(а) выпуска, сборка " + country + ", " + color + " цвет(а), объем двигателя - " + engineVolume + " л.";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && year == car.year && brand.equals(car.brand) && model.equals(car.model) && color.equals(car.color) && country.equals(car.country);
    }
    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, year, country);
    }
}
