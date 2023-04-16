package edu.ua.khpi.infiz.architecture.lab3;

public class UserSettingsCaretaker {
    private UserSettingsSnapshot snapshot;

    public void saveSnapshot(UserSettingsSnapshot snapshot) {
        this.snapshot = snapshot;
    }

    public UserSettingsSnapshot getSnapshot() {
        return snapshot;
    }
}
