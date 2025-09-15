package io.sergiocortes.javadockerapp.services;

import io.sergiocortes.javadockerapp.models.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeesService {

    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("John", "Doe", "Software Engineer"));
        employees.add(new Employee("Jane", "Smith", "Project Manager"));
        employees.add(new Employee("Alice", "Johnson", "QA Engineer"));
        employees.add(new Employee("Bob", "Brown", "DevOps Engineer"));

        return employees;
    }

}
