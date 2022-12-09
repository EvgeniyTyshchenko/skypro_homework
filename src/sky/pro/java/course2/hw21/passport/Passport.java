package sky.pro.java.course2.hw21.passport;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Passport {
    private Long passportID;
    private String surname;
    private String name;
    private String middleName;
    private LocalDate dateOfBirth;
    private static Map<Long, Passport> passportMap = new HashMap<>();

    public Passport(long passportID, String surname, String name, String middleName, LocalDate dateOfBirth) {
        if (passportID <= 0L) {
            throw new RuntimeException("Введите корректные паспортные данные!");
        } else {
            this.passportID = passportID;
        }
        this.surname = ValidateUtil.validateString(surname);
        this.name = ValidateUtil.validateString(name);
        this.middleName = ValidateUtil.validateString(middleName);
        this.dateOfBirth = dateOfBirth;
    }

    public long getPassportID() {
        return passportID;
    }

    public void setPassportID(long passportID) {
        if (passportID <= 0L) {
            throw new RuntimeException("Введите корректные паспортные данные!");
        } else {
            this.passportID = passportID;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = ValidateUtil.validateString(surname);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = ValidateUtil.validateString(name);
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = ValidateUtil.validateString(middleName);
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public static Map<Long, Passport> getPassportMap() {
        return passportMap;
    }

    public static void setPassportMap(Map<Long, Passport> passportMap) {
        Passport.passportMap = passportMap;
    }

    @Override
    public String toString() {
        return "Паспорт{" +
                "номер паспорта: " + passportID +
                ", фамилия:'" + surname + '\'' +
                ", имя: '" + name + '\'' +
                ", отчество: '" + middleName + '\'' +
                ", дата рождения: " + dateOfBirth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(passportID, passport.passportID) && Objects.equals(surname, passport.surname)
                && Objects.equals(name, passport.name) && Objects.equals(middleName, passport.middleName)
                && Objects.equals(dateOfBirth, passport.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportID, surname, name, middleName, dateOfBirth);
    }
}
