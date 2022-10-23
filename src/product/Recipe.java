package product;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe{
    private String name;

    private Set<Product> products = new HashSet<>();
    private double cost;
    private Set<Recipe> recipes = new HashSet<>();
    public Recipe(String name, Product... products) {
        this.name = name;
        for (int i = 0; i < products.length; i++) {
            this.products.add(products[i]);
        }
    }

    public void addRecipe() {
        if (recipes.contains(this)) {
            throw new RuntimeException("В список добавляется уже имеющийся рецепт");
        }
        recipes.add(this);
        System.out.println("Рецепт салата " + this.getName().toLowerCase() + " добавлен в список");
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

    public Set<Product> getProducts() {
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

