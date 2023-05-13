package edu.ua.khpi.infiz.architecture.lab8;

public class MySQLBuilder implements BuilderSQL {
private StringBuilder query;
public MySQLBuilder() {
    this.query = new StringBuilder();
}
public BuilderSQL select(String columns) {
    this.query.append("SELECT "+ columns);
    return this;
}
public BuilderSQL whereSQL(String condition) {
    this.query.append(" WHERE "+condition);
    return this;
}
public BuilderSQL limit(int limit) {
    this.query.append(" LIMIT "+limit);
    return this;
}
public String getSQL() {
    return this.query.toString();
}
}
