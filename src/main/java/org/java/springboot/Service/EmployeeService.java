package org.java.springboot.Service;

import org.java.springboot.model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployeeById(Long id);

    public void deleteEmployeeById(Long id);
}
