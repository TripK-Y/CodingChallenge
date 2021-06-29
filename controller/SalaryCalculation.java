package controller;

public class SalaryCalculation {

    //part time salary calculation
    public double partTimeSalary(int hours, double rate){
        double salary = hours * rate;

        return salary;
    }

    //full time salary calculation
    public double fullTimeSalary(int hours, double rate){
        double salary = hours * rate;

        return salary;
    }

    //contract salary calculation based on the hours after adding base pay of 10,000
    public double contractSalary(int hours, double rate){
        double salary = hours * rate + 10000.0;
        
        return salary;
    }
    
    
}