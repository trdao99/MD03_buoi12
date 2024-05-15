package com.ra.entity;

import java.util.Date;

public class Employee {
    private int empId;
    private String empName;
    private boolean gender;
    private Date birthday;
    private String address;
    private String department;
    private String position;
    private double salary;

    // Constructors, getters, and setters

    public Employee() {
    }

    public Employee(int empId, String empName, boolean gender, Date birthday, String address, String department, String position, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
        this.department = department;
        this.position = position;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}