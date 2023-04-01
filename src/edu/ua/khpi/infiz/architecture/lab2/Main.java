package edu.ua.khpi.infiz.architecture.lab2;

public class Main {
    public static void main(String[] args) {
        RegistrationPage registrationPage = new RegistrationPage();
        DeliveryDateSelector dateSelector = new DeliveryDateSelector(registrationPage);
        PickupOptionCheckbox pickupCheckbox = new PickupOptionCheckbox(registrationPage);
        ContactFields contactFields = new ContactFields(registrationPage);
        System.out.println(registrationPage);
        System.out.println(dateSelector);
        System.out.println(pickupCheckbox);
        System.out.println(contactFields);
    }
}
