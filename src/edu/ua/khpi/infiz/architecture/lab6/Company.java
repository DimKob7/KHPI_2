package edu.ua.khpi.infiz.architecture.lab6;

import java.util.List;

public class Company {
    private String name;
    private List<Department> departments;

    public Company(String name, List<Department> departments) {
        this.name = name;
        this.departments = departments;
    }

    public Company(Department[] departments) {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
    public void accept(ReportVisitor visitor) {
        visitor.visit(this);
    }
}
