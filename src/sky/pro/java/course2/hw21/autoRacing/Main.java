package sky.pro.java.course2.hw21.autoRacing;

import sky.pro.java.course2.hw21.autoRacing.driver.Driver;
import sky.pro.java.course2.hw21.autoRacing.driver.DriverCatB;
import sky.pro.java.course2.hw21.autoRacing.driver.DriverCatC;
import sky.pro.java.course2.hw21.autoRacing.driver.DriverCatD;
import sky.pro.java.course2.hw21.autoRacing.enums.BodyType;
import sky.pro.java.course2.hw21.autoRacing.enums.Capacity;
import sky.pro.java.course2.hw21.autoRacing.enums.LoadCapacity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        DriverCatB ivan = new DriverCatB("Васильев Иван Дмитриевич", "B", 7.5);
        DriverCatB dmitriy = new DriverCatB("Долгов Дмитрий Евгеньевич", "B", 12);
        DriverCatC evgeniy = new DriverCatC("Демидов Евгений Яковлевич", "C", 9);
        DriverCatC artem = new DriverCatC("Турченко Артем Витальевич", "C", 5.7);
        DriverCatD petr = new DriverCatD("Гончаров Петр Дмитриевич", "D", 13.6);
        DriverCatD maksim = new DriverCatD("Тарасенко Максим Максимович", "D", 8.3);

        Mechanic<Transport> valentin = new Mechanic<>("Филатов Валентин Андреевич", "Proff");
        Mechanic<Transport> sergey = new Mechanic<>("Лаврентьев Алексей Васильевич", "Proff");
        Mechanic<Car> konstantin = new Mechanic<>("Давыдов Константин Аркадьевич", "Klass");
        Mechanic<Truck> anton = new Mechanic<>("Шевченко Антон Михайлович", "Tes");
        Mechanic<Bus> daniil = new Mechanic<>("Петренко Даниил Викторович", "JJ");

        Sponsor east = new Sponsor("East", 7_500_000);
        Sponsor gazprom = new Sponsor("Gazprom", 12_000_000);
        Sponsor vertex = new Sponsor("Vertex", 5_750_000);
        Sponsor victory = new Sponsor("Victory", 11_250_000);

        Car<DriverCatB> bmw = new Car<>("BMW", "Z8", 3.0, BodyType.COUPE);
        bmw.addDriver(ivan);
        bmw.addMechanic(sergey, konstantin);
        bmw.addSponsors(vertex,victory);
        Car<DriverCatB> audi = new Car<>("Audi", "A8", 3.0, BodyType.SEDAN);
        audi.addDriver(dmitriy);
        audi.addMechanic(konstantin);
        audi.addSponsors(vertex,victory);

        Truck<DriverCatC> kamaz = new Truck<>("KAMAZ", "6520", 5.0, LoadCapacity.N3);
        kamaz.addDriver(evgeniy);
        kamaz.addMechanic(anton);
        kamaz.addSponsors(east,gazprom);
        Truck<DriverCatC> gaz = new Truck<>("GAZ", "3308", 4.0, LoadCapacity.N1);
        gaz.addDriver(artem);
        gaz.addMechanic(anton, valentin);
        gaz.addSponsors(east, gazprom, vertex);

        Bus<DriverCatD> mersedes = new Bus<>("Mercedes-Benz", "Sprinter", 3.5, Capacity.ESPECIALLY_SMALL);
        mersedes.addDriver(petr);
        mersedes.addMechanic(daniil, valentin);
        mersedes.addSponsors(gazprom, vertex);
        Bus<DriverCatD> volvo = new Bus<>("Volvo", "Bussar", 3.0, Capacity.BIG);
        volvo.addDriver(maksim);
        volvo.addMechanic(daniil);
        volvo.addSponsors(vertex, east);

        Set<Transport> transports = new HashSet<>();
        transports.add(bmw);
        transports.add(audi);

        transports.add(kamaz);
        transports.add(gaz);

        transports.add(mersedes);
        transports.add(volvo);

//        showInformation(bmw);
//        konstantin.carryOutMaintenance(audi);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addCar(bmw);
        serviceStation.addCar(audi);
        serviceStation.addTruck(kamaz);
        serviceStation.addTruck(gaz);

        serviceStation.carryOutMaintenance();
        serviceStation.carryOutMaintenance();
    }
    private static void showInformation(Transport transport) {
        System.out.println("Автомобиль: " + transport.getBrand() + " " + transport.getModel());
        for(Driver driver : transport.getDrivers()) {
            System.out.println(driver);
        }
        for (Mechanic mechanic : transport.getMechanics()) {
            System.out.println(mechanic);
        }
        for (Sponsor sponsor : transport.getSponsors()) {
            System.out.println(sponsor);
        }
    }

    private static void passDiagnostics(Transport... transports) {
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