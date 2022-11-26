package sky.pro.java.course2.hw15.flower;

import java.util.Objects;

public class Flower {
    private String flowerName;
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    public Flower(String flowerName, String flowerColor, String country, double cost, int lifeSpan) {
        if (flowerName == null || flowerName.isEmpty() || flowerName.isBlank()) {
            this.flowerName = "Введите название";
        } else {
            this.flowerName = flowerName;
        }
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        if (lifeSpan <= 0) {
            this.cost = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }
    public Flower(String flowerName, String flowerColor, String country, double cost) {
        this (flowerName, flowerColor, country, cost, 3);
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        if (flowerName == null || flowerName.isEmpty() || flowerName.isBlank()) {
            this.flowerName = "Введите название";
        } else {
            this.flowerName = flowerName;
        }
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }

    @Override
    public String toString() {
        return flowerName + "; цвет: " + flowerColor + "; страна происхождения: " + country + "; стоимость: " + cost + "; срок стояния: " + lifeSpan + " дня(дней)";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return Double.compare(flower.cost, cost) == 0 && lifeSpan == flower.lifeSpan && Objects.equals(flowerName, flower.flowerName) && Objects.equals(flowerColor, flower.flowerColor) && Objects.equals(country, flower.country);
    }
    @Override
    public int hashCode() {
        return Objects.hash(flowerName, flowerColor, country, cost, lifeSpan);
    }
}
