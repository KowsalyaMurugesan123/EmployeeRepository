package com.project.SpringProject.Mapper;

import com.project.SpringProject.Dto.EmployeeDto;
import com.project.SpringProject.entity.Employee;


public class Mapper {
    public static EmployeeDto mapToEmployeeDTO(Employee employee){
      EmployeeDto employeeDto = new EmployeeDto(
              employee.getEmployeeid(),
              employee.getEmployeename(),
              employee.getMobilenumber(),
              employee.getMailid(),
              employee.getAge(),
              employee.getSalary(),
              employee.getPfnumber()
      );
        return employeeDto;
    }
    public static Employee mapToEmployee(EmployeeDto employeeDto){
        Employee employee = new Employee(
        employeeDto.getEmployeeid(),
        employeeDto.getEmployeename(),
                employeeDto.getMobilenumber(),
                employeeDto.getMailid(),
                employeeDto.getAge(),
                employeeDto.getSalary(),
        employeeDto.getPfnumber()
        );
        return employee;
    }


}
