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
public class Salaried extends Employee{
    
    /**
     * Constructor for Salaried Employee
     * @param aName name of Salaried
     * @param aSal salary of Salaried
     * @param otHrs amount of overtime hours
     * @param otRate rate per overtime hour
     */
    public Salaried(String aName, double aSal, double otHrs, double otRate) {
        super(aName, aSal);
        overtimeHours = otHrs;
        overtimeRate = otRate;
    }
    
    /**
     * Set Overtime hours
     * @param otHrs desired overtime hours
     */
    public void setOvertime(double otHrs) {
        overtimeHours = otHrs;
    }
    
    /**
     * Set Overtime rates
     * @param otRate desired overtime rate
     */
    public void setOvertimeRate(double otRate) {
        overtimeRate = otRate;
    }
    
    /**
     * Tells us the new Salary
     * @return salary as salary + (overtime hours * overtime rate)
     */
    public double getSalary() {
        return super.getSalary() + (overtimeHours*overtimeRate);
    }
    
    /**
     * All the info about the Salaried
     * @return information in the form of a String
     */
    public String toString() {
        return "Name: " + super.getName() + ", Salary: " + super.getSalary()
                + ", Overtime Hours: " + overtimeHours + ", Overtime Rate: "
                + overtimeRate;
    }
    
    private double overtimeHours;
    private double overtimeRate;
    
}
