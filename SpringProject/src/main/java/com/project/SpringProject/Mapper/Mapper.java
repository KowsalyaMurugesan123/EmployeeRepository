package com.project.SpringProject.Mapper;

import com.project.SpringProject.Dto.EmployeeDto;
import com.project.SpringProject.entity.Employee;


public class Mapper {
    public static EmployeeDto mapToEmployeeDTO(Employee employee){
      EmployeeDto employeeDto = new EmployeeDto(
              employee.getEmployeeId(),
              employee.getEmployeeName(),
              employee.getMobileNumber(),
              employee.getMailId(),
              employee.getAge(),
              employee.getSalary(),
              employee.getPfNumber()
      );
        return employeeDto;
    }
    public static Employee mapToEmployee(EmployeeDto employeeDto){
        Employee employee = new Employee(
                employeeDto.getEmployeeId(),
                employeeDto.getEmployeeName(),
                employeeDto.getMobileNumber(),
                employeeDto.getMailId(),
                employeeDto.getAge(),
                employeeDto.getSalary(),
                employeeDto.getPfNumber()
        );
        return employee;
    }



}