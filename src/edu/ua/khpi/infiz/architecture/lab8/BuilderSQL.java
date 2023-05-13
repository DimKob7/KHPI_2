package edu.ua.khpi.infiz.architecture.lab8;

public interface BuilderSQL {
    BuilderSQL select(String columns);
    BuilderSQL whereSQL(String condition);
    BuilderSQL limit(int limit);
    String getSQL();
}
