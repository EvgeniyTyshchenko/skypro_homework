package sky.pro.java.course2.hw17;

import java.util.Objects;

abstract public class Transport implements Competing {
    private String brand;
    private String model;
    private double engineVolume;

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

        public abstract void startMoving ();
        public abstract void endMoving ();
        public abstract void printType();

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
