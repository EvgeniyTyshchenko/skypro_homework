package sky.pro.java.course2.hw20;

import java.util.Objects;

public class Mechanic <T extends Transport> {

    private final String fullName;
    private final String company;

    public Mechanic(String fullName, String company) {
        this.fullName = fullName;
        this.company = company;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCompany() {
        return company;
    }

    public void service(T transport) {
        transport.passDiagnostics();
    }

    public void carryOutMaintenance(T transport) {
        transport.repair();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(fullName, mechanic.fullName) && Objects.equals(company, mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, company);
    }

    @Override
    public String toString() {
        return "Механик: " + fullName + ", Компания: " + company;
    }
}
