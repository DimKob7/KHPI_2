package edu.ua.khpi.infiz.architecture.lab5;

public class Order extends BaseEntity {
    private Product product;
    private User user;
    private int quantity;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean validate() {
        // validation logic for Order
        return true;
    }

    public String toJson() {
        // JSON representation of Order
        return null;
    }
}
