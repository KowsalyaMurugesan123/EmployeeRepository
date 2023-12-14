package com.project.SpringProject.Service;


import com.project.SpringProject.Dto.EmployeeDto;
import com.project.SpringProject.ExceptionHandling.ValidationException;
import org.springframework.data.domain.Page;

import java.util.List;


public interface EmployeeService {


    public EmployeeDto addEmployee(EmployeeDto employeeDto) throws ValidationException;

    public void deleteEmployee(int id);
    public EmployeeDto updateEmployee(int id, EmployeeDto updateRequest);
     List<EmployeeDto> getAllEmployee();
     public EmployeeDto getEmployeeid(int id);

     public Page<EmployeeDto> getAllEmployee(int pageNo, int pageSize,String sortBy, String sorting);



}

