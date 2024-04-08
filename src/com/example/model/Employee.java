package com.example.model;

public class Employee {
    private String name;
    private int id;
    private Department department;
    private double salary;

    public Employee(String name, int id, Department department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Department getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", id=" + id + ", department=" + department + ", salary=" + salary + '}';
    }
}
