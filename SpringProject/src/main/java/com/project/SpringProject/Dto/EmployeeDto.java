package com.project.SpringProject.Dto;


public class EmployeeDto
{
    private int employeeid;
    private String employeename;
    private String mobilenumber;
    private String mailid;
    private int age;
    private int salary;
    private int pfnumber;

    public EmployeeDto(int employeeid, String employeename, String mobilenumber, String mailid, int age, int salary, int pfnumber) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.mobilenumber = mobilenumber;
        this.mailid = mailid;
        this.age = age;
        this.salary = salary;
        this.pfnumber = pfnumber;
    }

    public EmployeeDto() {
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getMailid() {
        return mailid;
    }

    public void setMailid(String mailid) {
        this.mailid = mailid;
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

    public int getPfnumber() {
        return pfnumber;
    }

    public void setPfnumber(int pfnumber) {
        this.pfnumber = pfnumber;
    }
}
