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
    
    public Salaried(String aName, double aSal, double otHrs, double otRate) {
        super(aName, aSal);
        overtimeHours = otHrs;
        overtimeRate = otRate;
    }
    
    public void setOvertime(double otHrs) {
        overtimeHours = otHrs;
    }
    
    public void setOvertimeRate(double otRate) {
        overtimeRate = otRate;
    }
    
    public double getSalary() {
        return super.getSalary() + (overtimeHours*overtimeRate);
    }
    
    
    private double overtimeHours;
    private double overtimeRate;
    
}
