package sky.pro.java.course2.hw16.Animals.Mammals;

import sky.pro.java.course2.hw16.Animals.Animals;

import java.util.Objects;

public abstract class Mammals extends Animals {
    private String livingEnvironment;
    private int speedOfMoving;

    public Mammals(String name, int age, String livingEnvironment, int speedOfMoving) {
        super(name, age);
        this.livingEnvironment = validateString(livingEnvironment);
        this.speedOfMoving = validateSpeedOfMoving(speedOfMoving);
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

    public int getSpeedOfMoving() {
        return speedOfMoving;
    }

    public void setSpeedOfMoving(int speedOfMoving) {
        if (speedOfMoving <= 0) {
            this.speedOfMoving = getSpeedOfMoving();
        } else {
            this.speedOfMoving = speedOfMoving;
        }
    }

    public void walk() {
        System.out.println("Млекопитающее животное гуляет");
    }
    public int validateSpeedOfMoving(int i) {
        return (i <= 0) ? 1 : i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return speedOfMoving == mammals.speedOfMoving && Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, speedOfMoving);
    }

    @Override
    public String toString() {
        return super.toString() + ", среда обитания: " + livingEnvironment + ", скорость перемещения: " + speedOfMoving + " км/ч";
    }
}