package edu.ua.khpi.infiz.architecture.lab4;

public class OwnDeliveryStrategy implements Strategy{
    @Override
    public double calculateCost(double distance) {
        // Реалізація розрахунку вартості доставки власною службою
        // ...
        return distance;
    }
}
