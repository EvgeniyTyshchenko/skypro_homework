package sky.pro.java.course2.hw19;

import sky.pro.java.course2.hw19.driver.DriverCatB;
import sky.pro.java.course2.hw19.driver.DriverCatC;
import sky.pro.java.course2.hw19.driver.DriverCatD;
import sky.pro.java.course2.hw19.enums.BodyType;
import sky.pro.java.course2.hw19.enums.Capacity;
import sky.pro.java.course2.hw19.enums.LoadCapacity;

public class Main {
    public static void main(String[] args) {
        Car<DriverCatB> bmw = new Car<>("BMW", "Z8", 3.0, BodyType.COUPE);
        Car<DriverCatB> audi = new Car<>("Audi", "A8", 3.0, BodyType.SEDAN);
        Car<DriverCatB> kia = new Car<>("Kia", "Sportage 4-го поколения", 2.4, BodyType.CROSSOVER);
        Car<DriverCatB> lada = new Car<>("Lada", "Granta", 1.7, BodyType.SEDAN);

        Truck<DriverCatC> kamaz = new Truck<>("KAMAZ", "6520", 5.0, LoadCapacity.N3);
        Truck<DriverCatC> gaz = new Truck<>("GAZ", "3308", 4.0, LoadCapacity.N1);
        Truck<DriverCatC> hyundai = new Truck<>("Hyundai", "Mighty", 4.5, LoadCapacity.N2);
        Truck<DriverCatC> renault = new Truck<>("Renault", "Kerax", 8.5, LoadCapacity.N3);

        Bus<DriverCatD> mersedes = new Bus<>("Mercedes-Benz", "Sprinter", 3.5, Capacity.ESPECIALLY_SMALL);
        Bus<DriverCatD> volvo = new Bus<>("Volvo", "Bussar", 3.0, Capacity.BIG);
        Bus<DriverCatD> iveco = new Bus<>("Iveco", "Daily", 3.0, Capacity.ESPECIALLY_SMALL);
        Bus<DriverCatD> paz = new Bus<>("PAZ", "3205", 2.0, Capacity.SMALL);

        DriverCatB driverCatB1 = new DriverCatB("Филатов Валентин Андреевич", "B", 12);
        passDiagnostics(bmw, audi, kia, lada, kamaz, gaz, hyundai, renault, mersedes, volvo, iveco, paz);
    }

    private static void passDiagnostics(Transport ... transports) {
        for (Transport transport : transports) {
            if (!transport.passDiagnostics()) {
                try {
                    throw new RuntimeException("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " не прошел диагностику.");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}