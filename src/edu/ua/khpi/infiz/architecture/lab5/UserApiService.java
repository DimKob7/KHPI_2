package edu.ua.khpi.infiz.architecture.lab5;

public class UserApiService extends BaseApiService {
    protected void validate(BaseEntity entity) {
        User user = (User) entity;
        if (user.getEmail() != null) {
            throw new IllegalArgumentException("Email cannot be updated");
        }
        if (!user.validate()) {
            throw new IllegalArgumentException("User validation failed");
        }
    }
    protected void save(BaseEntity entity) {
        // REST API call to save User
    }

    protected void notifyAdmin(BaseEntity entity) {
        // no need to notify admin for User
    }
}
