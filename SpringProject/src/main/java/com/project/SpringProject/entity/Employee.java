package com.project.SpringProject.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Employee")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employeeid", length = 50)
    private int employeeid;
    @Column(name = "employeename", length = 50)
    private String employeename;
    @Column(name = "mobilenumber", length = 12)
    private String mobilenumber;
    @Column(name = "mailid", length = 50)
    private String mailid;
    @Column(name = "age", length = 2)
    private int age;
    @Column(name = "salary", length = 10)
    private int salary;
    @Column(name = "pfnumber", length = 50)
    private int pfnumber;

    public Employee(int employeeid, String employeename, String mobilenumber, String mailid, int age, int salary, int pfnumber) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.mobilenumber = mobilenumber;
        this.mailid = mailid;
        this.age = age;
        this.salary = salary;
        this.pfnumber = pfnumber;
    }

    public Employee() {
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