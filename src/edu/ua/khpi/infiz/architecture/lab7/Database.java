package edu.ua.khpi.infiz.architecture.lab7;

abstract class Database {
    abstract void connect();
    abstract void executeQuery(String query);
}
