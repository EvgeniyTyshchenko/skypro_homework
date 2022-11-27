package sky.pro.java.course2.hw16.Animals.Amphibians;

import sky.pro.java.course2.hw16.Animals.Animals;

import java.util.Objects;

public class Amphibians extends Animals {
    private String livingEnvironment;

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = validateString(livingEnvironment);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) {
            this.livingEnvironment = getLivingEnvironment();
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public void hunts() {
        System.out.println("Земноводное животное охотится");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " кушает ");
    }
    @Override
    public void moves() {
        System.out.println(getName() + " плывёт ");
    }
    @Override
    public void sleep() {
        System.out.println(getName() + " спит");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livingEnvironment);
    }

    @Override
    public String toString() {
        return super.toString() + ", среда обитания: " + livingEnvironment + ", относится к классу: " + getClass();
    }
}