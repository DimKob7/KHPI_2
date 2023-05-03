package edu.ua.khpi.infiz.architecture.lab6;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Ivanov", 50000);
        Employee e2 = new Employee("Petrov", 30000);
        Employee e3 = new Employee("Kinko", 35000);
        Employee e4 = new Employee("Minko", 25000);
        Employee e5 = new Employee("Jozef", 20000);
        Employee e6 = new Employee("Fugo", 30000);

        Department itDepartment = new Department("IT", List.of(new Employee[]{e1, e2, e3}));
        Department hrDepartment = new Department("HR", List.of(new Employee[]{e4, e5, e6}));
        Company company = new Company(new Department[]{itDepartment, hrDepartment});

        SalaryReportVisitor salaryReportVisitor = new SalaryReportVisitor();
        company.accept(salaryReportVisitor);
        itDepartment.accept(salaryReportVisitor);
    }
}
