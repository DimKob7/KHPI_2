package edu.ua.khpi.infiz.architecture.lab7;

class PostgresSQLDatabase extends Database {
    @Override
    void connect() {
        System.out.println("Connected to PostgresSQL");
    }

    @Override
    void executeQuery(String query) {
        System.out.println("Executed query: " + query);
    }

}
