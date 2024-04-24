package org.example;

import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;


public class Employee {
    private long employeeId;
    private String employeeName;
    private LocalDate employeeDOB;

    private Department department;

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public LocalDate getEmployeeDOB() {
        return employeeDOB;
    }

    public void setEmployeeDOB(LocalDate employeeDOB) {
        this.employeeDOB = employeeDOB;
    }

    public Department getDepartment() {
        return department;
    }
    @Autowired
    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeDOB=" + employeeDOB +
                ", department=" + department +
                '}';
    }
}