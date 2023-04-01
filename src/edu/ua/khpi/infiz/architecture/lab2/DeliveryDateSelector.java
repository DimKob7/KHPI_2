package edu.ua.khpi.infiz.architecture.lab2;

import java.util.Date;

public class DeliveryDateSelector {
    private RegistrationMediator mediator;

    public DeliveryDateSelector(RegistrationMediator mediator) {
        this.mediator = mediator;
    }

    public void selectDeliveryDate(Date date) {
        mediator.deliverOn(date);
    }

}
