package sky.pro.java.course2.hw21.autoRacing;

import java.util.Objects;

public class Sponsor {
    private final String name;
    private final int amount;

    public Sponsor(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public void toSponsorRace() {
        System.out.println("Спонсор '" + name + "' проспонсировал заезд на " + amount + " руб.");
    }

    @Override
    public String toString() {
        return "Спонсор: " + name + ", сумма поддержки: " + amount + " руб.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return amount == sponsor.amount && Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount);
    }
}
