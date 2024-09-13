package com.design.pattern.structural.Proxy;

public class EmployeeDaoImpl  implements EmployeeDao{
    @Override
    public void createEmployee(String client, Employee employee) {

        System.out.println(" creating employee " + employee);
    }

    @Override
    public void deleteEmployee(String client, int empId) {
        System.out.println(" deleting employee " + empId);

    }

    @Override
    public Employee getEmployee(String client, int empId) {
        System.out.println(" getting employee " + empId);
        return new Employee();
    }
}
