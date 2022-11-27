package sky.pro.java.course2.hw16.Animals;

import java.util.Objects;

public abstract class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
        this.name = validateString(name);
        this.age = Math.abs(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = validateString(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = validateAge(age);
    }

    public void eat() {
        System.out.println("Животное ест");
    }

    public void moves() {
        System.out.println("Животное перемещается");
    }

    public void sleep() {
        System.out.println("Животное спит");
    }

    public String validateString(String s) {
        return s != null && s.isEmpty() && s.isBlank() ? "< Информация не указана >" : s;
    }
    public int validateAge(int i) {
        return (i <= 0) ? getAge() : i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return name + ", возраст: " + age + " лет";
    }
}