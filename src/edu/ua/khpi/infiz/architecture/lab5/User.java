package edu.ua.khpi.infiz.architecture.lab5;

public class User extends BaseEntity {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean validate() {
        // validation logic for User
        return true;
    }
}
