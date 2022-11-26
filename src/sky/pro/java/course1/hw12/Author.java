package sky.pro.java.course1.hw12;

import java.util.Objects;

public class Author {
    final private String name;
    final private String surname;

    public Author (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getName () {
        return name;
    }
    public String getSurname () {
        return surname;
    }
    @Override
    public String toString() {
        return name + surname;
    }
    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;
        Author author = (Author) object;
        return name.equals(author.name) && surname.equals((author.surname));
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
