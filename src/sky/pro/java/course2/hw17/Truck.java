package sky.pro.java.course2.hw17;

import sky.pro.java.course2.hw17.enums.LoadCapacity;

public class Truck<T extends DriverCatC> extends Transport {
    private LoadCapacity loadCapacity;

    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity == null ? LoadCapacity.N1 : loadCapacity;
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
    public void printType() {
        if (loadCapacity != null) {
            System.out.println(loadCapacity);
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }
    @Override
    public String toString () {
        return "Марка: " + getBrand() + ", модель: " + getModel() + ", объем двигателя: " + getEngineVolume() + " л, " + loadCapacity;
    }
}
