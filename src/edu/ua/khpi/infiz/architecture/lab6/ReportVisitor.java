package edu.ua.khpi.infiz.architecture.lab6;

public interface ReportVisitor {
    void visit(Employee employee);
    void visit(Department department);
    void visit(Company company);
}
