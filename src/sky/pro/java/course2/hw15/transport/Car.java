package sky.pro.java.course2.hw15.transport;

import java.time.LocalDate;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private final String color;
    private final int year;
    private final String country;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private final int numberSeats;
    private String rubber;
    private static String noInformation = "< Информация не указана >";
    private Key key;
    private Insurance insurance;

    public class Key {
        private String remoteEngineStart;
        private String keylessEntry;

        public Key(String remoteEngineStart, String keylessEntry) {
            if (remoteEngineStart == null || remoteEngineStart.isEmpty() || remoteEngineStart.isBlank()) {
                this.remoteEngineStart = noInformation;
            } else {
                this.remoteEngineStart = remoteEngineStart;
            }
            if (keylessEntry == null || keylessEntry.isEmpty() || keylessEntry.isBlank()) {
                this.keylessEntry = noInformation;
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
        private String validity;
        private int price;
        private int number;

        public Insurance(String validity, int price, int number) {
            if (validity == null || validity.isEmpty() || validity.isBlank()) {
                this.validity = noInformation;
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

        public String getValidity() {
            return validity;
        }

        public void setValidity(String validity) {
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

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, String registrationNumber, int numberSeats, String rubber) {
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
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
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
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = noInformation;
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = noInformation;
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            this.registrationNumber = noInformation;
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (numberSeats < 0) {
            this.numberSeats = Math.abs(numberSeats);
        } else {
            this.numberSeats = numberSeats;
        }
        if (rubber == null || rubber.isEmpty() || rubber.isBlank()) {
            this.rubber = noInformation;
        } else {
            this.rubber = rubber;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = noInformation;
        } else {
            this.transmission = transmission;
        }
    }

    public void setBodyType(String bodyType) {
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = noInformation;
        } else {
            this.bodyType = bodyType;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            this.registrationNumber = noInformation;
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public String getRubber() {
        return rubber;
    }

    public void setRubber(String rubber) {
        if (rubber == null || rubber.isEmpty() || rubber.isBlank()) {
            this.rubber = noInformation;
        } else {
            this.rubber = rubber;
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
        int validity = Integer.parseInt(this.insurance.getValidity());
        validity = validity - LocalDate.now().getYear();
        if (validity <= 0) {
            System.out.println("Cтраховка просрочена. Нужно срочно ехать оформлять новую.");
        }
    }
    public void insuranceNumberVerification() {
        String number = Integer.toString(insurance.getNumber());
        if (number.length() != 9) {
            System.out.println("Номер страховки некорректный!");
        }
    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + year + " год(а) выпуска, сборка: " + country + ", " + color + " цвет(а), объем двигателя - " + engineVolume + " л, коробка передач: " + transmission + ", тип кузова: " + bodyType + ", регистрационный номер: " + registrationNumber + ", количество мест: " + numberSeats + ", резина: " + rubber;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && year == car.year && numberSeats == car.numberSeats && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(country, car.country) && Objects.equals(transmission, car.transmission) && Objects.equals(bodyType, car.bodyType) && Objects.equals(registrationNumber, car.registrationNumber) && Objects.equals(rubber, car.rubber);
    }
    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, year, country, transmission, bodyType, registrationNumber, numberSeats, rubber, noInformation);
    }
}