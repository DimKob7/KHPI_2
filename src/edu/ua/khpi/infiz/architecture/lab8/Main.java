package edu.ua.khpi.infiz.architecture.lab8;

public class Main {
    public static void main(String[] args) {
        BuilderSQL mySQLBuilder = new MySQLBuilder();
        mySQLBuilder.select("name,age").whereSQL("age>30").limit(20);
        System.out.println("Result query : " + mySQLBuilder.getSQL());

        BuilderSQL pgSQLBuilder = new PostgreSQLBuilder();
        pgSQLBuilder.select("name, age").whereSQL("age>50").limit(50);
        System.out.println("Result query: " + pgSQLBuilder.getSQL());

    }
}
