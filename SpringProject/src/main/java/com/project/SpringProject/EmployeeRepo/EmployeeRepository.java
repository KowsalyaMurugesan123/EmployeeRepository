package com.project.SpringProject.EmployeeRepo;



import com.project.SpringProject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{

      boolean existsByMailId(String mailId);
      boolean existsByMobileNumber(String mobileNumber);

//    EmployeeDto findAllById(int id);
}
