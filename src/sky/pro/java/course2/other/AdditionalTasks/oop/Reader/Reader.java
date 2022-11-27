package sky.pro.java.course2.other.AdditionalTasks.oop.Reader;

import java.util.Objects;

public class Reader {
    private String fullName;
    private int libraryCardNumber;
    private String faculty;
    private String dateOfBirth;
    private String telephone;

    public Reader(String fullName, int libraryCardNumber, String faculty, String dateOfBirth, String telephone) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.telephone = telephone;
    }

    public String getFullName() {
        return fullName;
    }

    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getTelephone() {
        return telephone;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "fullName='" + fullName + '\'' +
                ", libraryCardNumber=" + libraryCardNumber +
                ", faculty='" + faculty + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", telephone='" + telephone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader reader = (Reader) o;
        return libraryCardNumber == reader.libraryCardNumber && Objects.equals(fullName, reader.fullName) && Objects.equals(faculty, reader.faculty) && Objects.equals(dateOfBirth, reader.dateOfBirth) && Objects.equals(telephone, reader.telephone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, libraryCardNumber, faculty, dateOfBirth, telephone);
    }
}
