package shoppingList;

import java.util.UUID;
public class Product {
    public String name;
    public int quantity;
    public String category;
    public boolean purchased;
    public String productId;

    public Product(String name, int quantity, String category) {
        this.name = name;
        this.quantity = quantity;
        this.category = category;
        this.purchased = false;
        this.productId = UUID.randomUUID().toString();
    }
    //name
    public String getName(){ return name;}
    public void setName(String name) {this.name = name;}
    //quantity
    public int getQuantity() {return quantity;}
    public void setQuantity(int quantity) {this.quantity = quantity;}
    //cat
    public String getCategory() {return category;}
    public void setCategory(String category) {this.category = category;}

    public void markAsPurchased() {this.purchased = true;}
    public void markAsNotPurchased() {this.purchased = false;}
    public void showProductInfo() {this.category = name + "(" +  quantity + "szt.) - " + category + purchased;}
    public void setProductId(String productId) {this.productId = productId;}

}
