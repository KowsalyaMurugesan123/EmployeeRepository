package com.project.SpringProject.Service.impl;


import com.project.SpringProject.Dto.EmployeeDto;
import com.project.SpringProject.EmployeeRepo.EmployeeRepository;
import com.project.SpringProject.ExceptionHandling.ResourceNotFoundException;
import com.project.SpringProject.Mapper.Mapper;
import com.project.SpringProject.Service.EmployeeService;
import com.project.SpringProject.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class EmployeeServiceImpl implements EmployeeService
{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto addEmployee(EmployeeDto employeeDto)
    {
        Employee employee = Mapper.mapToEmployee(employeeDto);
        Employee save = employeeRepository.save(employee);
        return Mapper.mapToEmployeeDTO(save);
    }
    @Override
    public void deleteEmployee(int id) {

        employeeRepository.deleteById(id);
    }



    @Override
    public EmployeeDto updateEmployee(int id, EmployeeDto updateRequest) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee id not Found"));

        Employee emp = Mapper.mapToEmployee(updateRequest);
        emp.setEmployeeid(employee.getEmployeeid());
        emp.setEmployeename(updateRequest.getEmployeename());
        emp.setMobilenumber(updateRequest.getMobilenumber());
        emp.setMailid(updateRequest.getMailid());
        emp.setAge(updateRequest.getAge());
        emp.setSalary(updateRequest.getSalary());
        emp.setPfnumber(updateRequest.getPfnumber()
        );
        Employee save = employeeRepository.save(emp);
        return Mapper.mapToEmployeeDTO(save);
  }
;

   @Override
    public List<EmployeeDto> getAllEmployee()
   {
      // Employee employee= Mapper.mapToEmployeeDTO(Employee );
       List<EmployeeDto> allEmployees = employeeRepository.findAll().stream().map(employee -> Mapper.mapToEmployeeDTO(employee))
               .collect(Collectors.toList());
       return allEmployees;

   }

    @Override
    public EmployeeDto getEmployeeid(int id)

    {
        Employee employee = employeeRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("id not present" + id)
        );
       return Mapper.mapToEmployeeDTO(employee);
    }
    @Override
    public Page findPaginated() {
        Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
        return this.employeeRepository.findAll(pageable);
    }



    }
