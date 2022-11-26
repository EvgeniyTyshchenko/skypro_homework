package sky.pro.java.course2.hw14.human;

import java.util.Objects;

public class Human {
    private final String name;
    private final int yearOfBirth;
    private final String town;
    private final String jobTitle;
    private static final String noInformation = "< Информация не указана >";

    public Human(String name, String town, int yearOfBirth, String jobTitle) {
        if (name == null || name.isEmpty()) {
            this.name = noInformation;
        } else {
            this.name = name;
        }
        if (town == null || town.isEmpty()) {
            this.town = noInformation;
        } else {
            this.town = town;
        }
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        if (jobTitle == null || jobTitle.isEmpty()) {
            this.jobTitle = noInformation;
        } else {
            this.jobTitle = jobTitle;
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return yearOfBirth == human.yearOfBirth && name.equals(human.name) && town.equals(human.town) && jobTitle.equals(human.jobTitle);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfBirth, town, jobTitle);
    }
    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился(ась) в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }
}
