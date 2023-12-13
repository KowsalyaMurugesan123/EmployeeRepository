package com.project.SpringProject.EmployeeRepo;


import com.project.SpringProject.Dto.EmployeeDto;
import com.project.SpringProject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{


//    EmployeeDto findAllById(int id);
}
