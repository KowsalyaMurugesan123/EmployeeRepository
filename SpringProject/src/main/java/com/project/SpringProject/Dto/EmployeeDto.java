package com.project.SpringProject.Dto;


import jakarta.persistence.Id;
import jakarta.validation.constraints.*;

public class EmployeeDto
{

    @Id
    private int employeeId;

    @NotBlank(message = "employee name should not blank")
    private String employeeName;
    @Pattern(regexp = "\\d{10}", message ="mobible no should have in 10 digits")
    private String mobileNumber;

    @NotBlank(message=" email id should not be blank")
    @Email
    @Size(max = 100, message = "user mailid should have at least 10 characters")
    private String mailId;

    @Positive
    private int age;

    @Positive(message = "salary should be positive")
    private int salary;
    @Positive(message  ="pf number should be positive")
    private int pfNumber;

    public EmployeeDto(int employeeId, String employeeName, String mobileNumber, String mailId, int age, int salary, int pfNumber) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.mobileNumber = mobileNumber;
        this.mailId = mailId;
        this.age = age;
        this.salary = salary;
        this.pfNumber = pfNumber;
    }

    public EmployeeDto() {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getPfNumber() {
        return pfNumber;
    }

    public void setPfNumber(int pfNumber) {
        this.pfNumber = pfNumber;
    }
}
