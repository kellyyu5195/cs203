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
    
    /**
     * Constructor for Manager
     * @param aName name of Manager
     * @param aSal salary of Manager
     * @param aBonus bonus of Manager
     */
    public Manager(String aName, int aSal, double aBonus) {
        super(aName, aSal);
        bonus = aBonus;
    }
    
    /**
     * Sets bonus
     * @param aBonus desired bonus 
     */
    public void setBonus(double aBonus) {
        bonus = aBonus;
    }
    
    /**
     * Gets new Salary
     * @return the salary as bonus + salary
     */
    public double getSalary() {
        return bonus + super.getSalary();
    }
    
    /**
     * Tells us info about Manager
     * @return info in the form of a String
     */
    public String toString() {
        return "Name: " + super.getName() + ", Salary: " + super.getSalary()
                + ", Bonus: " + bonus;
    }
    
    private double bonus;
    
}
