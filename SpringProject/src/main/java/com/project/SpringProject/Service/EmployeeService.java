package com.project.SpringProject.Service;


import com.project.SpringProject.Dto.EmployeeDto;
import org.springframework.data.domain.Page;

import java.util.List;


public interface EmployeeService {


     EmployeeDto addEmployee(EmployeeDto employeeDto);

     void deleteEmployee(int id);
     EmployeeDto updateEmployee(int id, EmployeeDto updateRequest);
     List<EmployeeDto> getAllEmployee();
   EmployeeDto getEmployeeid(int id);
    Page findPaginated(int pageno, int pagesize);



}

