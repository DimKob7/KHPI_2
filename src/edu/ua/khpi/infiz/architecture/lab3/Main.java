package edu.ua.khpi.infiz.architecture.lab3;

public class Main {
    public static void main(String[] args) {
        UserSettings userSettings = new UserSettings();
// ... встановлюємо налаштування ...
        UserSettingsCaretaker caretaker = new UserSettingsCaretaker();
        caretaker.saveSnapshot(userSettings.saveToSnapshot());
    }
}
