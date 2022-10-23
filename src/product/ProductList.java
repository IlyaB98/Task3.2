package product;

import java.util.HashSet;
import java.util.Set;

public class ProductList {

    Set<Product> products = new HashSet<>();

    public void addProduct(Product product) {
        if (products.contains(product)) {
            throw new RuntimeException("В список добавляется уже имеющийся продукт");
        }
        products.add(product);
        System.out.println(product.getName() + " добавлен в список");
    }

    public void removeProduct(Product product) {
        if (products.contains(product)) {
            products.remove(product);
            System.out.println(product.getName() + " удален из списка");
        } else {
            System.out.println("Данного продукта нет в списке");
        }
    }

    @Override
    public String toString() {
        return products.toString();
    }
}
