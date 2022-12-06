package sky.pro.java.course2.hw20;

import sky.pro.java.course2.hw20.driver.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

abstract public class Transport implements Competing {
    private String brand;
    private String model;
    private double engineVolume;
    private final List<Driver> drivers = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();

    public Transport(String brand, String model, double engineVolume) {
        this.brand = ValidateUtil.validateString(brand);
        this.model = ValidateUtil.validateString(model);
        if (engineVolume <= 0) {
            this.engineVolume = 3.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }
        public String getBrand () {
            return brand;
        }

        public String getModel () {
            return model;
        }

        public double getEngineVolume () {
            return engineVolume;
        }

        public List<Driver> getDrivers() {
            return drivers;
        }

        public List<Mechanic<?>> getMechanics() {
            return mechanics;
        }

        public List<Sponsor> getSponsors() {
            return sponsors;
        }

        public void addDriver(Driver drivers) {
            this.drivers.add(drivers);
        }
        public void addMechanic(Mechanic<?> ... mechanics) {
            this.mechanics.addAll(Arrays.asList(mechanics));
        }
        public void addSponsors(Sponsor ... sponsors) {
            this.sponsors.addAll(Arrays.asList(sponsors));
        }

        public abstract void startMoving ();
        public abstract void endMoving ();
        public abstract void printType();
        public abstract boolean passDiagnostics();
        public abstract void repair();

        @Override
        public String toString () {
            return "Марка: " + getBrand() + ", модель: " + getModel() + ", объем двигателя: " + getEngineVolume() + " л.";
        }

        @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Transport transport = (Transport) o;
            return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
        }

        @Override
        public int hashCode () {
            return Objects.hash(brand, model, engineVolume);
        }
}
