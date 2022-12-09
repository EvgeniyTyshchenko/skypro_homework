package sky.pro.java.course2.hw21.groceryList;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;


public class Test {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        Product bananas = new Product("Бананы", 102.9, 1.3);
        Product apples = new Product("Яблоки", 85.9, 2.5);
        Product tangerines = new Product("Мандарины", 90.0, 2.8);
        Product potatoes = new Product("Картофель", 52.9, 4.5);
        Product onion = new Product("Лук", 36.9, 2);
        Product cabbage = new Product("Капуста", 69.9, 3.4);
        Product milk = new Product("Молоко", 140.90, 2.0);
        Product eggs = new Product("Яйца", 110.0, 0.4);
        Product tomatoes = new Product("Помидоры", 59.9, 1.0);

        Product onion2 = new Product("Лук", 40.9, 1.7);

        Set<Product> products = new HashSet<>();
        products.add(bananas);
        products.add(apples);
        products.add(tangerines);
        products.add(potatoes);
        products.add(onion);
        products.add(cabbage);
        products.add(milk);
        products.add(eggs);
        products.add(tomatoes);

//        onion2.addProduct(products);
        System.out.println(products);

        System.out.println("Задание 2");
        Recipe fruitСocktail = new Recipe("Фруктовый коктейль");
        Recipe omelette = new Recipe("Омлет");
        Recipe salad = new Recipe("Салат");

        Set<Recipe> allRecipes = new HashSet<>();
        allRecipes.add(fruitСocktail);
        allRecipes.add(omelette);
//        omelette.addRecipe(allRecipes);

        System.out.println(allRecipes);

        fruitСocktail.addProductInRecipe(bananas, apples, milk);
        omelette.addProductInRecipe(eggs, milk, tomatoes);

        System.out.println("Задание 3");
        Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            integerSet.add((int) (Math.random() * 1000) + 1);
        }
        System.out.println(integerSet.stream().filter(n -> n % 2 == 0).collect(Collectors.toSet()));
    }
}
