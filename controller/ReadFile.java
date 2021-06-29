package controller;
import model.Employee;

import java.io.*;
import java.util.*;

public class ReadFile {
    ArrayList<Employee> employees = new ArrayList<Employee>();  //create arraylist of type Employee

    public ArrayList<Employee> getEmployeeData(){
        String line = "";  
        String splitBy = ",";  //delimiter that separates the value

        try {  
            //parsing a CSV file into BufferedReader class constructor  
            //to read file line by line until EOF
            BufferedReader br = new BufferedReader(new FileReader("/Users/keliekan/Desktop/CodingChallenge/input/salary.csv"));  
            while ((line = br.readLine()) != null) {  //returns a Boolean value 
                String[] input = line.split(splitBy);    // use comma as separator  
                
                //initializing values to employee objects 
                //if rates is more than $24/hr then rates will be saved as $24
                if(Integer.parseInt(input[1]) > 24){
                    employees.add(new Employee(input[0], 24, Integer.parseInt(input[2]), input[3], 0.0));
                }
                else{   //else rates is as it is
                    employees.add(new Employee(input[0], Integer.parseInt(input[1]), Integer.parseInt(input[2]), input[3], 0.0));
                }
            }  
        }  catch (IOException e) {  
            System.out.println("Something went wrong when saving data.");
            e.printStackTrace();  
        }
        return employees;
    }
}
