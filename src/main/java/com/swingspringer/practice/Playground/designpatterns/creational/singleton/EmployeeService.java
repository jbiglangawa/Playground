package com.swingspringer.practice.Playground.designpatterns.creational.singleton;

import com.swingspringer.practice.Playground.designpatterns.creational.builder.Employee;

public class EmployeeService {
    private static EmployeeService instance;

    public static synchronized EmployeeService getInstance() {
        if(instance == null) {
            instance = new EmployeeService();
        }
        return instance;
    }

    public void createEmployee(Employee employee) {
        System.out.println("Employee being created...");
        System.out.println(employee);
    }
}
