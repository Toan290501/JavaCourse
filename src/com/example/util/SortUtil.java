package com.example.util;

import com.example.model.Employee;

import java.util.List;
import java.util.Comparator;

public class SortUtil {
    public static List<Employee> sortEmployeesByName(List<Employee> employees) {
        employees.sort(Comparator.comparing(Employee::getName));
        return employees;
    }
}
