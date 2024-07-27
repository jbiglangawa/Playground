package com.swingspringer.practice.Playground.designpatterns.creational.builder;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Employee {
    private final int id;
    private final String name;
    private final String designation;
    private final Double salary;
    private final String employer;

    public Employee(EmployeeBuilder builder) {
        this.id = builder.getId();
        this.name = builder.getName();
        this.designation = builder.getDesignation();
        this.salary = builder.getSalary();
        this.employer = builder.getEmployer();
    }
}































