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
public class Manager extends Employee{
    
    public Manager(String aName, int aSal) {
        super(aName, aSal);
    }
    
    public void setBonus(double aBonus) {
        bonus = aBonus;
    }
    
    public double getSalary() {
        return bonus + super.getSalary();
    }
    
    public String toString() {
        return super.getName() + ": " + this.getSalary();
    }
    
    private double bonus;
    
}
