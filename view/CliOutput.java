package view;

import java.util.*;

public class CliOutput {
    
    //to print menu of program and ask user which option they woudl prefer to print salary info
    public static int printMenu(){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to the salary calculator!");
        System.out.println("Option 1: calculate total salary");
        System.out.println("Option 2: calculate total salary grouped by roles");
        System.out.println("Please enter either 1 or 2 based on the option listed above.");
        
        int option = keyboard.nextInt();
        keyboard.close();

        return option;
    }

    //to print total salary 
    public static void printResults(double totalSalary){
        System.out.println("Total Salary: $" + totalSalary);
    }

    //to print total salary for each type of employment
    public static void printResultsGroupedByRoles(double partTimeSalary, double fullTimeSalary, double contractSalary){
        System.out.println("Total part time salary: $" + partTimeSalary);
        System.out.println("Total full time salary: $" + fullTimeSalary);
        System.out.println("Total contract salary: $" + contractSalary);
    }
}
