package product;

import java.util.*;

public class Recipe {

    private String name;

    private Map<Product, Integer> products = new HashMap<>();
    private double cost;
    private Set<Recipe> recipes = new HashSet<>();
    public Recipe(String name, ProductWithQuantity... productWithQuantities) {
        this.name = name;
        for (ProductWithQuantity current : productWithQuantities) {
            products.put(current.getProduct(), current.getQuantity());
        }
    }

    public static class ProductWithQuantity {
        private final Product product;
        private final int quantity;

        public ProductWithQuantity(Product product, int quantity) {
            this.product = product;
            this.quantity = quantity;
        }

        public Product getProduct() {
            return product;
        }

        public int getQuantity() {
            return quantity;
        }
    }

        public void addRecipe () {
            if (recipes.contains(this)) {
                throw new RuntimeException("В список добавляется уже имеющийся рецепт");
            }
            recipes.add(this);
            System.out.println("Рецепт салата " + this.getName().toLowerCase() + " добавлен в список");
        }

        public void priceDish () {
            double price = 0;
            for (Product value : this.getProducts().keySet()) {
                price += value.getPrice() * this.getProducts().get(value);
            }
            System.out.println("Салат " + this.getName().toLowerCase() + " стоит - " + price);
        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public double getCost () {
            return cost;
        }

        public void setCost ( double cost){
            this.cost = cost;
        }

        public Map<Product, Integer> getProducts () {
            return products;
        }

        public Set<Recipe> getRecipes () {
            return recipes;
        }

        @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Recipe recipe = (Recipe) o;
            return name.equals(recipe.name);
        }

        @Override
        public int hashCode () {
            return Objects.hash(name);
        }

        @Override
        public String toString () {
            return "Салат " + getName().toLowerCase() + " состоит из " + products.size() + " фруктов: " + getProducts();
        }
}

