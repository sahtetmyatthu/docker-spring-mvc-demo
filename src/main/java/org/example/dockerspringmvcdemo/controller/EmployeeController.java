package org.example.dockerspringmvcdemo.controller;

import lombok.RequiredArgsConstructor;
import org.example.dockerspringmvcdemo.dao.EmployeeDao;
import org.example.dockerspringmvcdemo.entity.Employees;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeDao employeeDao;

    @GetMapping("/employees")
    public List<Employees> listEmployees() {
        return employeeDao.findAll();
    }
}
