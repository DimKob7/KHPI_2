package edu.ua.khpi.infiz.architecture.lab5;

public class ProductApiService extends BaseApiService {
    protected void validate(BaseEntity entity) {
        Product product = (Product) entity;
        if (!product.validate()) {
            product.notifyAdmin();
            throw new IllegalArgumentException("Product validation failed");
        }
    }

    protected void save(BaseEntity entity) {
        // REST API call to save Product
    }

    protected void notifyAdmin(BaseEntity entity) {
        // send notification to admin about failed validation
    }
}
