package edu.ua.khpi.infiz.architecture.lab4;

public class DeliveryApp {
    private Strategy strategy;

    public void getStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public double calculateDeliveryCost(double distance) {
        return strategy.calculateCost(distance);
    }
}
