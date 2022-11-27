package sky.pro.java.course2.hw16.Transport;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Lada", "Granta", 1.7, "желтого", 2015, "Россия",160, "механическая", "седан", "B751HP123", 5, "зимняя");
        Car car2 = new Car("Audi", "A8", 3.0, "черный", 2020, "Германия", 260, "автоматическая", "купе", "B777HC777", 2, "зимняя");
        Car car3 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия", 240, "автоматическая", "купе", "B123HC799", 2, "зимняя");
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея", 200, "автоматическая", "кроссовер", "P056HC126", 5, "летняя");
        Car car5 = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", 180,"механическая", "седан", "C481HC799", 5, "зимняя");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
        System.out.println();

        car1.changeTires("лето");
        System.out.println(car1);
        System.out.println();

        car5.checkRegistrationNumber(car5.getRegistrationNumber());

        System.out.println();
        Car.Insurance ladaGranta = car1.new Insurance(LocalDate.of(2023,2,15), 8000, 756892365);
        Car.Insurance audiA8 = car2.new Insurance(LocalDate.of(2021,8,13), 15000, 265455932);
        Car.Insurance bmwZ8 = car3.new Insurance(LocalDate.of(2024,1,21), 13000, 458778954);
        Car.Insurance kiaSportage = car4.new Insurance(LocalDate.of(2023,11,7), 9500, 56985634);
        Car.Insurance hyundaiAvante = car5.new Insurance(LocalDate.of(2022,11,21), 7000, 136523694);
        car1.setInsurance(ladaGranta);
        car2.setInsurance(audiA8);
        car3.setInsurance(bmwZ8);
        car4.setInsurance(kiaSportage);
        car5.setInsurance(hyundaiAvante);

        car2.checkExpirationDateInsurance();
        System.out.println();
        car4.insuranceNumberVerification();
        car2.refill();
        System.out.println("---------");

        Train lastochka = new Train("Ласточка", "B-901", 2011, "Россия", null, 301, 3500, 3, "Белорусский вокзал", "станция Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", null, 270, 1700, 2, "Ленинградский вокзал", "станция Ленинград-Пассажирский", 8);
        System.out.println(lastochka);
        System.out.println(leningrad);
        leningrad.refill();
        System.out.println();
        Bus mersedes = new Bus("Mercedes-Benz", "Sprinter", 2010, "Германия", "белый", 220, "Московская", "Зиповская", 750);
        Bus volvo = new Bus("Volvo", "Bussar", 2015, "Швеция", "красный", 180, "Кутузовская", "Вишневая", 1400);
        Bus iveco = new Bus("Iveco", "Daily", 2012, "Италия", "серый", 210, "Янтарная", "Тургеневская", 650);
        System.out.println(mersedes);
        System.out.println(volvo);
        mersedes.refill();
    }
}