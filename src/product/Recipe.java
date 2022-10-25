package product;

import java.util.*;

public class Recipe {
    private String name;
    private Map<Product, Integer> products = new HashMap<>();
    private double cost;
    private Set<Recipe> recipes = new HashSet<>();

    public Recipe(String name, Map<Product, Integer>... products) {
//        Очень долго пробовал разными способами сделать так, чтобы в конструкторе можно было обработать неограниченное
//        количество фруктов и добавить их в HashMap, но не один не сработал, пытался передать через конструктор одновременно
//        Product... products и Integer... integers, не позволяла idea, отдельно один из параметров работает, а вот 2 сразу
//        нет. Поэтому лучшего варианта чем создать отдельный метод и его вызывать при создании объекта не нашел.
//        Можно ли эту проблему решить более красиво?
        this.name = name;
        for (int i = 0; i < products.length; i++) {
            this.products.putAll(products[i]);
        }
    }

    public static Map<Product, Integer> addIngredients(Product product, Integer value) {
        Map<Product, Integer> map = new HashMap<>();
        if (value <= 0) {
            value = 1;
        }
        map.put(product, value);
        return map;
    }

    public void addRecipe() {
        if (recipes.contains(this)) {
            throw new RuntimeException("В список добавляется уже имеющийся рецепт");
        }
        recipes.add(this);
        System.out.println("Рецепт салата " + this.getName().toLowerCase() + " добавлен в список");
    }

    public static void priceDish(Recipe recipe) {
        double price = 0;
        for (Product value: recipe.getProducts().keySet()) {
                price += value.getPrice() * recipe.getProducts().get(value);
        }
        System.out.println("Салат " + recipe.getName().toLowerCase() + " стоит - " + price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return name.equals(recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Салат " + getName().toLowerCase() + " состоит из " + products.size() + " фруктов: " + getProducts();
    }
}

