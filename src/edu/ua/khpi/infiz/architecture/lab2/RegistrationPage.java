package edu.ua.khpi.infiz.architecture.lab2;

import java.util.Date;
import java.util.List;

public class RegistrationPage implements RegistrationMediator {

    private Date deliveryDate;
  //  private List<TimeSlot> availableTimeSlots;
    private boolean isPickup;
    private boolean showContactFields;
    private String name;
    private String phoneNumber;

    @Override
    public void deliverOn(Date date) {
        this.deliveryDate = date;
      //  this.availableTimeSlots = TimeSlotService.getAvailableTimeSlotsForDate(date);
    }

    @Override
    public void enableContactFields(boolean enabled) {
        this.showContactFields = enabled;
    }

    @Override
    public void enablePickup(boolean enabled) {
        this.isPickup = enabled;
        if (enabled) {
            this.showContactFields = false;
        }
    }
    public void updateName(String name) {
        this.name = name;
    }

    public void updatePhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
