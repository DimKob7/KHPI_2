package edu.ua.khpi.infiz.architecture.lab10;

public class InputElement implements FormElement {
    private String name;

    public InputElement(String name) {
        this.name = name;
    }

    @Override
    public void render() {
        System.out.println("<input type=\"text\" name=\"" + name + "\">");
    }

    @Override
    public String toString() {
        return "InputElement{" +
                "name='" + name + '\'' +
                '}';
    }
}
