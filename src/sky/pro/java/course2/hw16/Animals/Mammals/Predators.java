package sky.pro.java.course2.hw16.Animals.Mammals;

import java.util.Objects;

public class Predators extends Mammals {
    private String typeOfFood;

    public Predators(String name, int age, String livingEnvironment, int speedOfMoving, String typeOfFood) {
        super(name, age, livingEnvironment, speedOfMoving);
        this.typeOfFood = validateString(typeOfFood);
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood == null || typeOfFood.isEmpty() || typeOfFood.isBlank()) {
            this.typeOfFood = getTypeOfFood();
        } else {
            this.typeOfFood = typeOfFood;
        }
    }

    public void hunts() {
        System.out.println(getName() + " охотится");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " кушает " + getTypeOfFood());
    }
    @Override
    public void moves() {
        System.out.println(getName() + " быстро перемещается");
    }
    @Override
    public void sleep() {
        System.out.println(getName() + " спит");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return Objects.equals(typeOfFood, predators.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public String toString() {
        return super.toString() + ", тип пищи: " + typeOfFood + ", относится к классу: " + getClass();
    }
}