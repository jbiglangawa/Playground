package com.swingspringer.practice.Playground.designpatterns.creational.builder;

public class AdminBuilder implements EmployeeBuilder {
    private int id;
    private String name;
    private String designation;
    private Double salary;
    private String employer;

    public AdminBuilder() {
        this.designation = "Admin";
        this.salary = 100000.0;
        this.employer = "JM Enterprises";
    }

    @Override
    public EmployeeBuilder id(int id) {
        this.id = id;
        return this;
    }

    @Override
    public EmployeeBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public EmployeeBuilder designation(String designation) {
        this.designation = designation;
        return this;
    }

    @Override
    public EmployeeBuilder salary(Double salary) {
        this.salary = salary;
        return this;
    }

    @Override
    public EmployeeBuilder employer(String employer) {
        this.employer = employer;
        return this;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDesignation() {
        return this.designation;
    }

    @Override
    public Double getSalary() {
        return this.salary;
    }

    @Override
    public String getEmployer() {
        return this.employer;
    }

    @Override
    public Employee build() {
        return new Employee(this);
    }
}
