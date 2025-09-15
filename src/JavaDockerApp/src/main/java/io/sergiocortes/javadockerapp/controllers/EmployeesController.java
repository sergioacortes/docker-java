package io.sergiocortes.javadockerapp.controllers;

import io.sergiocortes.javadockerapp.models.Employee;
import io.sergiocortes.javadockerapp.services.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeesController {

    @Autowired
    private EmployeesService employeesService;

    @GetMapping("/api/employees")
    public List<Employee> getEmployees() {
        return employeesService.getEmployees();
    }

}
