package edu.ua.khpi.infiz.architecture.lab4;

public class ExternalDeliveryStrategy implements Strategy {
    @Override
    public double calculateCost(double distance) {
        // Реалізація розрахунку вартості доставки зовнішньою службою
        // ...
        return distance;
    }
}
