package edu.ua.khpi.infiz.architecture.lab2;

public class PickupOptionCheckbox {
    private RegistrationMediator mediator;

    public PickupOptionCheckbox(RegistrationMediator mediator) {
        this.mediator = mediator;
    }

    public void togglePickupOption(boolean enabled) {
        mediator.enablePickup(enabled);
    }
}
