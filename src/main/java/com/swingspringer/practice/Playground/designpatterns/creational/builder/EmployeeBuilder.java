package com.swingspringer.practice.Playground.designpatterns.creational.builder;

public interface EmployeeBuilder {
    EmployeeBuilder id(int id);
    EmployeeBuilder name(String name);
    EmployeeBuilder designation(String designation);
    EmployeeBuilder salary(Double salary);
    EmployeeBuilder employer(String employer);
    int getId();
    String getName();
    String getDesignation();
    Double getSalary();
    String getEmployer();
    Employee build();
}
