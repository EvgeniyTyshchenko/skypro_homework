package sky.pro.java.course2.hw16.Animals.Birds;

import sky.pro.java.course2.hw16.Animals.Animals;

import java.util.Objects;

public abstract class Birds extends Animals {
    private String livingEnvironment;

    public Birds(String name, int age, String livingEnvironment) {
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
        System.out.println("Птица охотится");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(livingEnvironment, birds.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    @Override
    public String toString() {
        return super.toString() + ", среда обитания: " + livingEnvironment;
    }
}