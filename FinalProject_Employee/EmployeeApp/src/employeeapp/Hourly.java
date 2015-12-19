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
public class Hourly extends Employee{
    
    /**
     * Constructor for Hourly Worker
     * @param aName Name of worker
     * @param aRate Hourly rate
     * @param hrs Hours worked
     */
    public Hourly (String aName, double aRate, double hrs) {
        super(aName, 0);
        HourlyRate = aRate;
        Hours = hrs;
    }
    
    /**
     * Set hours
     * @param hrs desired hours 
     */
    public void setHours(double hrs) {
        Hours = hrs;
    }
    
    /**
     * Sets hourly rate
     * @param aRate desired rate
     */
    public void setHourlyRate(double aRate){
        HourlyRate = aRate;
    }
    
    /**
     * Tells us the Salary
     * @return hours * hourly rate
     */
    public double getSalary() {
        return Hours * HourlyRate;
    }
    
    /**
     * Tells all all the info in a String
     * @return String with fields
     */
    public String toString() {
        return "Name: " + super.getName() + ", Salary: " + super.getSalary()
                + ", Hourly Rate: " + HourlyRate + ", Hours: "
                + Hours;
    }
    
    private double HourlyRate;
    private double Hours;   
}
