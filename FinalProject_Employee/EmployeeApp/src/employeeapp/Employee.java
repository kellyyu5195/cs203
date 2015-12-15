/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employeeapp;

/**
 *
 * @author Kelly Yu Two
 */
public class Employee {
    
    public Employee (String aName, double aSal){
        name = aName;
        salary = aSal;
    }
    
    public void setSalary(double aSal) {
        salary = aSal;
    }
    
    public String getName() {
        return name;
    }
    
    public double getSalary() {
        return salary;
    }
    
    private String name;
    private double salary;
    
}
