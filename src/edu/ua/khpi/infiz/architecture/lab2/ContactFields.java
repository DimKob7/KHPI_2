package edu.ua.khpi.infiz.architecture.lab2;

public class ContactFields {
    private RegistrationMediator mediator;
    public ContactFields(RegistrationMediator mediator) {
        this.mediator = mediator;
    }
    public void enableFields(boolean enabled) {
        mediator.enableContactFields(enabled);
    }

    public void updateName(String name) {
        mediator.updateName(name);
    }

    public void updatePhoneNumber(String phoneNumber) {
        mediator.updatePhoneNumber(phoneNumber);
    }
}
