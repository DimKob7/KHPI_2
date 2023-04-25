package edu.ua.khpi.infiz.architecture.lab5;

public class OrderApiService extends BaseApiService {
    protected void validate(BaseEntity entity) {
        Order order = (Order) entity;
        if (!order.validate()) {
            throw new IllegalArgumentException("Order validation failed");
        }
    }

    protected void save(BaseEntity entity) {
        Order order = (Order) entity;
        // REST API call to save Order
    }

    protected void notifyAdmin(BaseEntity entity) {
        // no need to notify admin for Order
    }

    public void update(Order order) {
        super.update(order);
        String json = order.toJson();
        // return JSON representation of updated Order
    }
}
