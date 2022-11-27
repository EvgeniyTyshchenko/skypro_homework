package sky.pro.java.course2.hw17;

public class Main {
    public static void main(String[] args) {
        Car<DriverCatB> bmw = new Car<>("BMW", "Z8", 3.0);
        Car<DriverCatB> audi = new Car<>("Audi", "A8", 3.0);
        Car<DriverCatB> kia = new Car<>("Kia", "Sportage 4-го поколения", 2.4);
        Car<DriverCatB> lada = new Car<>("Lada", "Granta", 1.7);

        Truck<DriverCatC> kamaz = new Truck<>("KAMAZ", "6520", 5.0);
        Truck<DriverCatC> gaz = new Truck<>("GAZ", "3308", 4.0);
        Truck<DriverCatC> hyundai = new Truck<>("Hyundai", "Mighty", 4.5);
        Truck<DriverCatC> renault = new Truck<>("Renault", "Kerax", 8.5);

        Bus<DriverCatD> mersedes = new Bus<>("Mercedes-Benz", "Sprinter", 3.5);
        Bus<DriverCatD> volvo = new Bus<>("Volvo", "Bussar", 3.0);
        Bus<DriverCatD> iveco = new Bus<>("Iveco", "Daily", 3.0);
        Bus<DriverCatD> paz = new Bus<>("PAZ", "3205", 2.0);

        System.out.println(audi);
        System.out.println(hyundai);
        System.out.println(volvo);
        bmw.startMoving();
        hyundai.startMoving();
        mersedes.endMoving();
        kia.pitStop();
        gaz.showTopSpeed();
        System.out.println("---------");

        DriverCatB driverCatB = new DriverCatB("Иванов Виталий Александрович", "категория В", 4.5);
        DriverCatC driverCatC = new DriverCatC("Васильев Вячеслав Викторович", "категория С", 7.1);
        DriverCatD driverCatD = new DriverCatD("Филатов Валентин Андреевич", "категория D", 12);

        bmw.participate(driverCatB);
        kamaz.participate(driverCatC);
        mersedes.participate(driverCatD);
    }
}