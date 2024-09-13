package com.design.pattern.structural.Proxy;

public class ProxyDesign {
    public static void main(String[] args) throws Exception {


        EmployeeDao employeeDao = new EmployeeProxy();
        employeeDao.createEmployee("ADMIN", new Employee(30,"John Doe"));

    }
}
