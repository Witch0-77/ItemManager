package shoppingList;
import java.util.ArrayList;

public interface ItemManager {
    String addItem(String name, int quantity, String category, boolean purchased);
    void removeItem(String name);
    Product getItem(String name);
    ArrayList<Product> getAllItems();
}
