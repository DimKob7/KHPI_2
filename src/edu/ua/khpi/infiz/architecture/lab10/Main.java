package edu.ua.khpi.infiz.architecture.lab10;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створення елементів форми
        FormElement usernameInput = new InputElement("username");
        FormElement countrySelect = new SelectElement("country", List.of("USA", "Canada", "Ukraine"));

        // Створення групи полів вводу
        Fieldset personalInfoFieldset = new Fieldset();
        personalInfoFieldset.addElement(usernameInput);
        personalInfoFieldset.addElement(countrySelect);

        // Відображення форми
        personalInfoFieldset.render();
    }

}
