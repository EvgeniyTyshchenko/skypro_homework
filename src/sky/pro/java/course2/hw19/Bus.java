package sky.pro.java.course2.hw19;

import sky.pro.java.course2.hw19.driver.DriverCatD;
import sky.pro.java.course2.hw19.enums.Capacity;

public class Bus <T extends DriverCatD> extends Transport {
    private Capacity capacity;

    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity == null ? Capacity.SMALL : capacity;
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " начал движение");
    }

    @Override
    public void endMoving() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " закончил движение");
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
    public void printType() {
        if (capacity != null) {
            System.out.println(capacity);
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }

    @Override
    public boolean passDiagnostics() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагностике не требуется");
        return true;
    }

    @Override
    public String toString () {
        return "Марка: " + getBrand() + ", модель: " + getModel() + ", объем двигателя: " + getEngineVolume() + " л, " + capacity;
    }
}
