package edu.ua.khpi.infiz.architecture.lab3;

public class UserSettings {
    private boolean receiveEmailNotifications;
    private boolean receivePushNotifications;
    private boolean receiveSMSNotifications;

    // Конструктор та методи отримання та встановлення значень полів
    // ...

    public UserSettingsSnapshot saveToSnapshot() {
        return new UserSettingsSnapshot(receiveEmailNotifications, receivePushNotifications, receiveSMSNotifications);
    }

    public void restoreFromSnapshot(UserSettingsSnapshot snapshot) {
        this.receiveEmailNotifications = snapshot.getReceiveEmailNotifications();
        this.receivePushNotifications = snapshot.getReceivePushNotifications();
        this.receiveSMSNotifications = snapshot.getReceiveSMSNotifications();
    }
}
