package sky.pro.java.course2.hw16.Animals.Birds;

import java.util.Objects;

public class Flying extends Birds {
    private String typeOfMovement;

    public Flying(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);
        this.typeOfMovement = validateString(typeOfMovement);
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void setTypeOfMovement(String typeOfMovement) {
        if (typeOfMovement == null || typeOfMovement.isEmpty() || typeOfMovement.isBlank()) {
            this.typeOfMovement = getTypeOfMovement();
        } else {
            this.typeOfMovement = typeOfMovement;
        }
    }

    public void fly() {
        System.out.println(getName() + "летает");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " клюёт крошки хлеба");
    }
    @Override
    public void moves() {
        System.out.println(getName() + " перемещается " + getTypeOfMovement());
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
        Flying flying = (Flying) o;
        return Objects.equals(typeOfMovement, flying.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }

    @Override
    public String toString() {
        return super.toString() + ", тип передвижения: " + typeOfMovement + ", относится к классу: " + getClass();
    }
}