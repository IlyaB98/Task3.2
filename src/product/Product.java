package product;

import java.util.Objects;

public class Product {

    private String name;
    private double price;
    private double weight;

    public Product(String name, double price, double weight) {
        setName(name);
        setPrice(price);
        setWeight(weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null && name.isBlank() && name.isEmpty()) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Double.compare(product.weight, weight) == 0 &&
                name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, weight);
    }

    @Override
    public String toString() {
        return name;
    }
}
