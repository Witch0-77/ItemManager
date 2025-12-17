package shoppingList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;


public class ItemManagerImlp implements ItemManager {
    HashMap<String, Product> products = new HashMap<>();
    HashMap<String, String> availableProducts = new HashMap<>();

    ArrayList<Product> productsList = new ArrayList<>();

    @Override
    public String addItem(String name, int quantity, String category, boolean purchased) {
        String productId = UUID.randomUUID().toString();
        Product product = new Product(name, quantity, category);
        product.setProductId(productId);
        product.markAsNotPurchased();
        products.put(productId, product);
        return productId;
    }

    @Override
    public void removeItem(String name) {
        products.remove(name);
    }

    @Override
    public Product getItem(String name) {
        return products.get(name);
    }

    @Override
    public ArrayList<Product> getAllItems() {
        return new ArrayList<>(products.values());
    }
// fuh this nie chce mi się mam dosyć    public Arraylist<Product> showList() {}

    public void markAsPurchased(String name) {
        products.get(name).markAsPurchased();
    }
}