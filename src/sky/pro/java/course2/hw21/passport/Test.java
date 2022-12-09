package sky.pro.java.course2.hw21.passport;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {

        Passport romanov = new Passport(7016_123456L, "Романов", "Дмитрий", "Игоревич", LocalDate.of(1992, 5, 21));
        Passport demidov = new Passport(7015_123452L, "Демидов", "Виктор", "Васильевич", LocalDate.of(1985, 9, 13));
        Passport petrov = new Passport(7014_123451L, "Петров", "Максим", "Евгеньевич", LocalDate.of(1992, 05, 21));
        Passport viktor = new Passport(7016_123456L, "Никитин", "Виктор", "Владимирович", LocalDate.of(1979, 11, 03));

        Passport.getPassportMap().put(romanov.getPassportID(), romanov);
        Passport.getPassportMap().put(demidov.getPassportID(), demidov);
        Passport.getPassportMap().put(petrov.getPassportID(), petrov);

        Passport.getPassportMap().put(viktor.getPassportID(), viktor);
        System.out.println(Passport.getPassportMap());
        System.out.println(Passport.getPassportMap().get(7015123452L));
    }
}
