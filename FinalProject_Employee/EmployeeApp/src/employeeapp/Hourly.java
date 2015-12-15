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
    
    public Hourly (String aName, double aRate, double hrs) {
        super(aName, 0);
        HourlyRate = aRate;
        Hours = hrs;
    }
    
    public void setHours(double hrs) {
        Hours = hrs;
    }
    
    public void setHourlyRate(double aRate){
        HourlyRate = aRate;
    }
    
    public double getSalary() {
        return Hours * HourlyRate;
    }
    
    public String toString() {
        return super.getName() + ": " + this.getSalary();
    }
    
    private double HourlyRate;
    private double Hours;
    
    
}
