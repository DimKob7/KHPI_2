package edu.ua.khpi.infiz.architecture.lab7;

public class Main {
    public static void main(String[] args) {
        DatabaseSingleton databaseSingleton = DatabaseSingleton.getInstance();

        PostgresSQLDatabase postgresSQLDatabase = new PostgresSQLDatabase();
        databaseSingleton.addDatabase("PostgresSQL", postgresSQLDatabase);
        Database postgresql = databaseSingleton.getDatabase("PostgresSQL");
        postgresql.connect();
        postgresql.executeQuery("SELECT * FROM users");

        MongoDBDatabase mongoDBDatabase = new MongoDBDatabase();
        databaseSingleton.addDatabase("MongoDB", mongoDBDatabase);
        Database mongodb = databaseSingleton.getDatabase("MongoDB");
        mongodb.connect();
        mongodb.executeQuery("db.users.find()");


    }
}
