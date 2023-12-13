package com.project.SpringProject.EmployeeController;


import com.project.SpringProject.Dto.EmployeeDto;
import com.project.SpringProject.Mapper.Mapper;
import com.project.SpringProject.Service.EmployeeService;
import com.project.SpringProject.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@CrossOrigin
@RequestMapping("api/v1/Employee")

public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping(path = "/Save")
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto)
    {

        EmployeeDto savedemploye = employeeService.addEmployee(employeeDto);
        return new ResponseEntity<>(savedemploye, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable ("id") int id ) {
        employeeService.deleteEmployee(id);
        return "employee deleted successfully!!!";
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable("id") int id, @RequestBody EmployeeDto employeeDto)
    {

        EmployeeDto employeeDto1 = employeeService.updateEmployee(id, employeeDto);
        return  ResponseEntity.ok().body(employeeDto1);
    }

    @GetMapping("/all")
    public List<EmployeeDto> getAllEmployee(){
//        return employeeService.getAllEmployee().stream().map(employee -> Mapper.mapToEmployeeDTO(employee))
//                .collect(Collectors.toList());
        return employeeService.getAllEmployee();
    }

    @GetMapping("/getbyid/{id}")
    public ResponseEntity<EmployeeDto>getEmployeeid(@PathVariable("id") int id){
        EmployeeDto employeeDto=employeeService.getEmployeeid(id);
        return  ResponseEntity.ok().body(employeeDto);
    }

    @GetMapping("/pagination/{pageno}")
    Page findPaginated(int pageno, int pagesize) {
        return employeeService.findPaginated();
    }
}