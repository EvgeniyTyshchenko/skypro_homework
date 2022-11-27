package sky.pro.java.course2.hw16.Transport;

import java.time.LocalDate;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car extends Transport {
    private final double engineVolume;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private final int numberSeats;
    private String rubber;
    private Key key;
    private Insurance insurance;

    public class Key {
        private String remoteEngineStart;
        private String keylessEntry;

        public Key(String remoteEngineStart, String keylessEntry) {
            if (remoteEngineStart == null || remoteEngineStart.isEmpty() || remoteEngineStart.isBlank()) {
                this.remoteEngineStart = getNoInformation();
            } else {
                this.remoteEngineStart = remoteEngineStart;
            }
            if (keylessEntry == null || keylessEntry.isEmpty() || keylessEntry.isBlank()) {
                this.keylessEntry = getNoInformation();
            } else {
                this.keylessEntry = keylessEntry;
            }
        }

        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public String getKeylessEntry() {
            return keylessEntry;
        }
    }
    public class Insurance {
        private LocalDate validity;
        private int price;
        private int number;

        public Insurance(LocalDate validity, int price, int number) {
            if (validity == null) {
                this.validity = LocalDate.now().plusDays(365);;
            } else {
                this.validity = validity;
            }
            if (price <= 0) {
                this.price = 6500;
            } else {
                this.price = price;
            }
            if (number <= 0) {
                this.number = 100000001;
            } else {
                this.number = number;
            }
        }

        public LocalDate getValidity() {
            return validity;
        }

        public void setValidity(LocalDate validity) {
            this.validity = validity;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country, int maxSpeed, String transmission, String bodyType, String registrationNumber, int numberSeats, String rubber) {
        super(brand, model, year, country, color, maxSpeed);

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = getNoInformation();
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = getNoInformation();
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            this.registrationNumber = getNoInformation();
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (numberSeats < 0) {
            this.numberSeats = Math.abs(numberSeats);
        } else {
            this.numberSeats = numberSeats;
        }
        if (rubber == null || rubber.isEmpty() || rubber.isBlank()) {
            this.rubber = getNoInformation();
        } else {
            this.rubber = rubber;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = getNoInformation();
        } else {
            this.transmission = transmission;
        }
    }

    public void setBodyType(String bodyType) {
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = getNoInformation();
        } else {
            this.bodyType = bodyType;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            this.registrationNumber = getNoInformation();
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public String getRubber() {
        return rubber;
    }

    public void setRubber(String rubber) {
        if (rubber == null || rubber.isEmpty() || rubber.isBlank()) {
            this.rubber = getNoInformation();
        } else {
            this.rubber = rubber;
        }
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberSeats() {
        return numberSeats;
    }
    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void changeTires(String season) {
        if (season.equals("весна") || season.equals("лето") || season.equals("осень")) {
            setRubber("летняя");
        } else {
            setRubber("зимняя");
        }
    }
    public void checkRegistrationNumber(String registrationNumber) {
        String regex = "^[A-Z]{1}[0-9]{3}[A-Z]{2}[0-9]{3}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(registrationNumber);
        if (matcher.matches() == true) {
            System.out.println("Регистрационный номер введен верно");;
        } else {
            System.out.println("Регистрационный номер введен некорректно");;
        }
    }
    public void checkExpirationDateInsurance() {
        if (this.insurance.getValidity().isBefore(LocalDate.now()))
            System.out.println("Cтраховка просрочена. Нужно срочно ехать оформлять новую.");
        }

    public void insuranceNumberVerification() {
        String number = Integer.toString(insurance.getNumber());
        if (number.length() != 9) {
            System.out.println("Номер страховки некорректный!");
        }
    }
    @Override
    public void refill() {
        System.out.println("Заправляемся бензином");
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", " + getYear() + " год(а) выпуска, сборка: " + getCountry() + ", " + getColor() + " цвет(а), объем двигателя - " + engineVolume + " л, коробка передач: " + transmission + ", тип кузова: " + bodyType + ", регистрационный номер: " + registrationNumber + ", количество мест: " + numberSeats + ", резина: " + rubber;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && getYear() == car.getYear() && numberSeats == car.numberSeats && Objects.equals(getBrand(), car.getBrand()) && Objects.equals(getModel(), car.getModel()) && Objects.equals(getColor(), car.getColor()) && Objects.equals(getColor(), car.getColor()) && Objects.equals(transmission, car.transmission) && Objects.equals(bodyType, car.bodyType) && Objects.equals(registrationNumber, car.registrationNumber) && Objects.equals(rubber, car.rubber);
    }
    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), engineVolume, getColor(), getYear(), getCountry(), transmission, bodyType, registrationNumber, numberSeats, rubber);
    }
}