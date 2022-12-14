package sky.pro.java.course2.hw22.groceryList;

public class Test {
    public static void main(String[] args) {

        Product bananas = new Product("Бананы", 102.9, 1.3);
        Product apples = new Product("Яблоки", 85.9, 2.5);
        Product tangerines = new Product("Мандарины", 90.0, 2.8);
        Product potatoes = new Product("Картофель", 52.9, 4.5);
        Product onion = new Product("Лук", 36.9, 2);
        Product cabbage = new Product("Капуста", 69.9, 3.4);
        Product milk = new Product("Молоко", 140.90, 2.0);
        Product eggs = new Product("Яйца", 110.0, 0.4);
        Product tomatoes = new Product("Помидоры", 59.9, 1.0);

        Recipe fruitCocktail = new Recipe("Фруктовый коктейль");
        Recipe omelette = new Recipe("Омлет");
        Recipe salad = new Recipe("Салат");

        fruitCocktail.addProductInRecipe(bananas, 0.3);
        fruitCocktail.addProductInRecipe(apples,0.4);
        fruitCocktail.addProductInRecipe(milk, 0.5);
        fruitCocktail.calculateTotalCostRecipe();
    }
}
