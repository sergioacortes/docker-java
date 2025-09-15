package io.sergiocortes.javadockerapp.controllers;

import io.sergiocortes.javadockerapp.services.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private EmployeesService employeesServices;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("employees", employeesServices.getEmployees());
        return "home";
    }

}
