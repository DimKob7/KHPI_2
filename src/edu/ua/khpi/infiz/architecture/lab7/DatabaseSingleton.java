package edu.ua.khpi.infiz.architecture.lab7;

import java.util.HashMap;
import java.util.Map;

public class DatabaseSingleton {
    private static DatabaseSingleton instance;
    private Map<String,Database> databases;
    private DatabaseSingleton() {
        databases = new HashMap<>();
    }
    public static synchronized DatabaseSingleton getInstance() {
        if (instance ==null) {
            instance = new DatabaseSingleton();
        } return instance;
    }
    public void addDatabase(String name, Database database) {
        databases.put(name, database);
    }

   public Database getDatabase(String name) {
       return databases.get(name);
   }
}
