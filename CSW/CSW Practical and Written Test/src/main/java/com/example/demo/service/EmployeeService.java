package com.example.demo.service;

import com.example.demo.jpa.Employee;
import java.util.List;

public interface EmployeeService {
    List<Employee> listEmployee();
    Employee getEmployeeById(int id);
    boolean saveEmployee(Employee employee);
    boolean updateEmployee(Employee employee);
}
