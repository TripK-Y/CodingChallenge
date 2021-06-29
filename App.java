import model.Employee;
import view.CliOutput;
import controller.ReadFile;
import controller.SalaryCalculation;

import java.util.*;

public class App {
    public static void main(String[] args) {
        ArrayList<Employee> employees; // declaring arraylist of objects
        ReadFile file = new ReadFile(); // Instantiating class
        SalaryCalculation cal = new SalaryCalculation(); // Instantiating class

        int option = CliOutput.printMenu(); // printing menu of program and saving returned value to a variable
        double employeeSalary = 0.0; // to save salary info that is return from the method
        double totalSalary = 0.0; // total salary after calculations
        double partTimeSalary = 0.0; // part time salary group
        double fullTimeSalary = 0.0; // full time salary group
        double contractSalary = 0.0; // contract salary group

        // option 1: calculate total salary in dollars
        if (option == 1) {
            try {
                // returning arraylist after saving data to arraylist object
                employees = file.getEmployeeData();

                // Loops to check employment type of employees
                // To calculate the correct salary for each group
                for (int i = 0; i < employees.size(); i++) {
                    if (employees.get(i).getEmployeeRole().equals("Part Time")) {
                        employeeSalary = cal.partTimeSalary(employees.get(i).getEmployeeHours(),
                                employees.get(i).getEmployeeRates());
                        employees.get(i).setEmployeeSalary(employeeSalary);
                    } else if (employees.get(i).getEmployeeRole().equals("Full Time")) {
                        employeeSalary = cal.fullTimeSalary(employees.get(i).getEmployeeHours(),
                                employees.get(i).getEmployeeRates());
                        employees.get(i).setEmployeeSalary(employeeSalary);
                    } else {
                        employeeSalary = cal.contractSalary(employees.get(i).getEmployeeHours(),
                                employees.get(i).getEmployeeRates());
                        employees.get(i).setEmployeeSalary(employeeSalary);
                    }
                    totalSalary = totalSalary + employees.get(i).getEmployeeSalary();
                }

                // printing total salary
                CliOutput.printResults(totalSalary);
            } catch (Exception e) {
                System.out.println("Something went wrong when reading file.");
                e.printStackTrace();

            }
        }
        // option 2: calculate total salary in dollars grouped by roles
        if (option == 2) {
            try {
                // Getting employee's data from file
                employees = file.getEmployeeData();

                // Loops to check employment type of employees
                // To calculate the correct salary
                for (int i = 0; i < employees.size(); i++) {
                    if (employees.get(i).getEmployeeRole().equals("Part Time")) {
                        employeeSalary = cal.partTimeSalary(employees.get(i).getEmployeeHours(),
                                employees.get(i).getEmployeeRates());
                        employees.get(i).setEmployeeSalary(employeeSalary);
                        partTimeSalary += employeeSalary;
                    } else if (employees.get(i).getEmployeeRole().equals("Full Time")) {
                        employeeSalary = cal.fullTimeSalary(employees.get(i).getEmployeeHours(),
                                employees.get(i).getEmployeeRates());
                        employees.get(i).setEmployeeSalary(employeeSalary);
                        fullTimeSalary = fullTimeSalary + employeeSalary;
                    } else {
                        employeeSalary = cal.contractSalary(employees.get(i).getEmployeeHours(),
                                employees.get(i).getEmployeeRates());
                        employees.get(i).setEmployeeSalary(employeeSalary);
                        contractSalary = contractSalary + employeeSalary;
                    }
                }

                // printing salary in groups
                CliOutput.printResultsGroupedByRoles(partTimeSalary, fullTimeSalary, contractSalary);
            } catch (Exception e) {
                System.out.println("Something went wrong when reading file.");
                e.printStackTrace();
            }
        }

    }
}
