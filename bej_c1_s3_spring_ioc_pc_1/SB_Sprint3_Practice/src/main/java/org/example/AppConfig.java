package org.example;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

public class AppConfig {
    @Bean("employee")
    public Employee getEmployeeDetails()
    {
        Employee employee = new Employee();
        employee.setEmployeeId(181500708);
        employee.setEmployeeName("Srashti");
        employee.setEmployeeDOB(LocalDate.parse("2000-07-13"));

        return employee;
    }
    @Bean
    public Department getDepartment()
    {
        return new Department(56785423,"Software");
    }
}