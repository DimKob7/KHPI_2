package edu.ua.khpi.infiz.architecture.lab2;

import java.util.Date;

public interface RegistrationMediator {
    void deliverOn(Date date);
    void enableContactFields(boolean enabled);
    void enablePickup(boolean enabled);

    void updateName(String name);

    void updatePhoneNumber(String phoneNumber);
}
