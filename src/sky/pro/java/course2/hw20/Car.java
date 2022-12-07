package sky.pro.java.course2.hw20;

import sky.pro.java.course2.hw20.driver.DriverCatB;
import sky.pro.java.course2.hw20.enums.BodyType;

public class Car <T extends DriverCatB> extends Transport {
    private BodyType bodyType;

    public Car(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType == null ? BodyType.SEDAN : bodyType;
    }

    @Override
    public void startMoving() {
        System.out.println("Легковой автомобиль " + getBrand() + " " + getModel() + " начал движение");
    }

    @Override
    public void endMoving() {
        System.out.println("Легковой автомобиль " + getBrand() + " " + getModel() + " закончил движение");
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
        if (bodyType != null) {
            System.out.println(bodyType);
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }

    @Override
    public boolean passDiagnostics() {
        return Math.random() > 0.5;
    }

    @Override
    public void repair() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " починен! Готов к заезду!");
    }

    @Override
    public String toString () {
        return "Марка: " + getBrand() + ", модель: " + getModel() + ", объем двигателя: " + getEngineVolume() + " л, " + bodyType;
    }
}