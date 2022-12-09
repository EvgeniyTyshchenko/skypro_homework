package sky.pro.java.course2.hw21.groceryList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private String nameRecipe;
    private Set<Product> products;
    private double totalСost;

    public Recipe(String nameRecipe) {
        this.nameRecipe = (nameRecipe != null || !nameRecipe.isEmpty()) ? nameRecipe : "< Введите название рецепта >";
        this.products = new HashSet<>();
    }

    public String getNameRecipe() {
        return nameRecipe;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public double getTotalСost() {
        return totalСost;
    }

    public void addRecipe(Set<Recipe> recipeSet) {
        if (!recipeSet.contains(this)) {
            recipeSet.add(this);
        } else {
            throw new RuntimeException("Рецепт " + this.nameRecipe + " раннее был добавлен");
        }
    }

    public void addProductInRecipe(Product ... products) {
        this.getProducts().addAll(Arrays.asList(products));
        for (Product product : this.products) {
            this.totalСost += product.getPrice();
        }
        System.out.printf("%s%s %s %.2f %s \n", "Общая стоимость продуктов для рецепта ", this.nameRecipe, "составляет:", totalСost, "руб.");
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
        return Double.compare(recipe.totalСost, totalСost) == 0 && Objects.equals(nameRecipe, recipe.nameRecipe) && Objects.equals(products, recipe.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameRecipe, products, totalСost);
    }
}
