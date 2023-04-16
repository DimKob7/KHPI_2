package edu.ua.khpi.infiz.architecture.lab3;

public class UserSettingsSnapshot {
    private final boolean receiveEmailNotifications;
    private final boolean receivePushNotifications;
    private final boolean receiveSMSNotifications;

    public UserSettingsSnapshot(boolean receiveEmailNotifications, boolean receivePushNotifications, boolean receiveSMSNotifications) {
        this.receiveEmailNotifications = receiveEmailNotifications;
        this.receivePushNotifications = receivePushNotifications;
        this.receiveSMSNotifications = receiveSMSNotifications;
    }

    public boolean getReceiveEmailNotifications() {
        return receiveEmailNotifications;
    }

    public boolean getReceivePushNotifications() {
        return receivePushNotifications;
    }

    public boolean getReceiveSMSNotifications() {
        return receiveSMSNotifications;
    }
}
