package com.design.pattern.structural.Proxy;

public interface EmployeeDao {

    public void createEmployee(String client, Employee employee) throws Exception;
    public void deleteEmployee(String client, int empId) throws Exception;
    public Employee getEmployee(String client, int empId) throws Exception;
}
