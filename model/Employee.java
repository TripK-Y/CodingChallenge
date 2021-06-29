package model;

public class Employee {

    private String name; // name of employee
    private double rates; // rates per hour
    private int hours; // hours per week
    private String roles; // type of employment [fullTime, partTime, contract]
    private double salary;  //salary of the employee

    //constructor to initialize instances
    public Employee(String name, int rates, int hours, String roles, double salary) {
        this.name = name;
        this.rates = rates;
        this.hours = hours;
        this.roles = roles;
        this.salary = salary;
    }

    // getter for employee's name
    public String getEmployeename() {
        return name;
    }

    // setter for employee's name
    public void setEmployeename(String name) {
        this.name = name;
    }

    // getter for employee's rates
    public double getEmployeeRates() {
        return rates;
    }

    // setter for employee's rates
    public void setEmployeeRates(double rates) {
        this.rates = rates;
    }

    // getter for employee's hours
    public int getEmployeeHours() {
        return hours;
    }

    // setter for employee's hours
    public void setEmployeeHours(int hours) {
        this.hours = hours;
    }

    // getter for employee's role
    public String getEmployeeRole() {
        return roles;
    }

    // setter for employee's role
    public void setEmployeeRole(String roles) {
        this.roles = roles;
    }

    // getter for employee's salary
    public double getEmployeeSalary() {
        return salary;
    }

    // setter for employee's salary
    public void setEmployeeSalary(double salary) {
        this.salary = salary;
    }

}