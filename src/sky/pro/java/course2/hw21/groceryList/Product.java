package sky.pro.java.course2.hw21.groceryList;

import java.util.Objects;
import java.util.Set;

public class Product {
    private String title;
    private double price;
    private double amount;

    public Product(String title, double price, double amount) {
        this.title = ValidateUtil.validateString(title);
        this.price = ValidateUtil.validateDouble(price);
        this.amount = ValidateUtil.validateDouble(amount);
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = ValidateUtil.validateDouble(price);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = ValidateUtil.validateDouble(amount);
    }

    public void addProduct(Set<Product> products) {
        if (!products.contains(this)) {
            products.add(this);
        } else {
            throw new RuntimeException("В списке продуктов уже имеется(-ются) - " + this.title);
        }
    }

    @Override
    public String toString() {
        return "<" + title + ">" + ", цена: " + price + " руб, вес: " + amount + " кг";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(title, product.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}