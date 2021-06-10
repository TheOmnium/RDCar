package com.vdab.rdcar.controllers;
import com.vdab.rdcar.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "/")
    public String showEmployeePage(Model model) {
        model.addAttribute("allEmployees", employeeService.getEmployees());
        return "index";
    }
}
