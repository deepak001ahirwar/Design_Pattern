package com.design.pattern.structural.Proxy;

public class EmployeeProxy implements EmployeeDao {

    EmployeeDao employeeDao;

    public EmployeeProxy() {
        this.employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void createEmployee(String client, Employee employee) throws Exception {

        if (client.equals("ADMIN")) {
            employeeDao.createEmployee(client, employee);
        }else{
            throw new Exception("ACCESS DENIED");

        }
    }

    @Override
    public void deleteEmployee(String client, int empId) throws Exception {
        if (client.equals("ADMIN")) {
            employeeDao.deleteEmployee(client, empId);
        }else {
            throw new Exception("ACCESS DENIED");
        }

    }

    @Override
    public Employee getEmployee(String client, int empId) throws Exception {

        if (client.equals("ADMIN") || client.equals("USER")) {
            return employeeDao.getEmployee(client, empId);
        }else {
            throw new Exception("ACCESS DENIED");
        }

    }
}
