package com.example.service;

import com.example.model.Employee;
import com.example.model.Department;
import com.example.util.SortUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> sortEmployeesByName() {
        return SortUtil.sortEmployeesByName(new ArrayList<>(employees));
    }

    public List<Employee> getEmployeesByDepartment(Department department) {
        return employees.stream()
                .filter(e -> e.getDepartment() == department)
                .collect(Collectors.toList());
    }
}
