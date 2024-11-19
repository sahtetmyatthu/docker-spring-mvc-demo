package org.example.dockerspringmvcdemo.dao;

import org.example.dockerspringmvcdemo.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employees, Integer> {

}
