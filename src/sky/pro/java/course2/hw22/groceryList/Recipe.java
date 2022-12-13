package sky.pro.java.course2.hw22.groceryList;

import java.util.*;

public class Recipe {
    private final String nameRecipe;
    private final HashMap<Product, Double> products;
    private double totalCost;

    public Recipe(String nameRecipe) {
        this.nameRecipe = (nameRecipe != null || !nameRecipe.isEmpty()) ? nameRecipe : "< Введите название рецепта >";
        this.products = new HashMap<>();
    }

    public String getNameRecipe() {
        return nameRecipe;
    }

    public HashMap<Product, Double> getProducts() {
        return products;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void addRecipe(Set<Recipe> recipeSet) {
        if (!recipeSet.contains(this)) {
            recipeSet.add(this);
        } else {
            throw new RuntimeException("Рецепт " + this.nameRecipe + " раннее был добавлен");
        }
    }

    public void addProductInRecipe(Product product, double quantity) {
        if (quantity == 0.0) {
            quantity = 1;
        }
        products.put(product, quantity);
    }

    public void calculateTotalCostRecipe() {
        for (Map.Entry<Product, Double> pr : products.entrySet()) {
            this.totalCost += pr.getKey().getPrice() * pr.getValue();
        }
        System.out.println("Общая стоимость рецепта: " + totalCost + " руб.");
    }

    @Override
    public String toString() {
        return "Рецепт: " + nameRecipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Double.compare(recipe.totalCost, totalCost) == 0 && Objects.equals(nameRecipe, recipe.nameRecipe) && Objects.equals(products, recipe.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameRecipe, products, totalCost);
    }
}
