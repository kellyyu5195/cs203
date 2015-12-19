/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employeeapp;
import java.util.*;
import java.io.*;
import java.io.Serializable;

/**
 *
 * @author Kelly Yu Two
 */
public class Employee implements Serializable{
    
    // Constructor for Employee
    public Employee (String aName, double aSal){
        name = aName;
        salary = aSal;
    }
    
    /**
     * Sets the salary
     * @param aSal a double that represents the new salary
     */
    public void setSalary(double aSal) {
        salary = aSal;
    }
    
    /**
     * Tells us the name of the Employee
     * @return name, the name of the employee
     */
    public String getName() {
        return name;
    }
    
    /**
     * Tells us the salary of the Employee
     * @return salary, the salary of the employee
     */
    public double getSalary() {
        return salary;
    }
    
    /**
     * Tells us info about Employee
     * @return tells us info of Employee in a String
     */
    public String toString() {
        return name + ": " + salary;
    }
    
    private String name;
    private double salary;

}
