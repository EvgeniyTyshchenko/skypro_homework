package sky.pro.java.course2.hw15.transport;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Lada", "Granta", 1.7, "желтого", 2015, "Россия", "механическая", "седан", "B751HP123", 5, "зимняя");
        Car car2 = new Car("Audi", "A8", 3.0, "черный", 2020, "Германия", "автоматическая", "купе", "B777HC777", 2, "зимняя");
        Car car3 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия", "автоматическая", "купе", "B123HC799", 2, "зимняя");
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея", "автоматическая", "кроссовер", "P056HC126", 5, "летняя");
        Car car5 = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "механическая", "седан", "C481HC799", 5, "зимняя");

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
        Car.Insurance ladaGranta = car1.new Insurance("2023", 8000, 756892365);
        Car.Insurance audiA8 = car2.new Insurance("2021", 15000, 265455932);
        Car.Insurance bmwZ8 = car3.new Insurance("2024", 13000, 458778954);
        Car.Insurance kiaSportage = car4.new Insurance("2023", 9500, 56985634);
        Car.Insurance hyundaiAvante = car5.new Insurance("2022", 7000, 136523694);
        car1.setInsurance(ladaGranta);
        car2.setInsurance(audiA8);
        car3.setInsurance(bmwZ8);
        car4.setInsurance(kiaSportage);
        car5.setInsurance(hyundaiAvante);

        car2.checkExpirationDateInsurance();
        System.out.println();
        car4.insuranceNumberVerification();
    }
}
