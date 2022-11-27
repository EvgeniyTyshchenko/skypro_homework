package sky.pro.java.course2.hw17;

public class Truck<T extends DriverCatC> extends Transport {
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " + getModel() + " начал движение");
    }

    @Override
    public void endMoving() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " + getModel() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println(this + " остановился на пит-стоп");
    }

    @Override
    public void showBestLapTime() {
        System.out.println(this + " показал лучшее время круга");
    }

    @Override
    public void showTopSpeed() {
        System.out.println(this + " показал максимальную скорость");
    }
    public void participate(T driver) {
        System.out.println("Водитель " + driver.getFullName() + " управляет автомобилем " + this + " и будет участвовать в заезде");
    }
}
