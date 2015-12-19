/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employeeapp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kelly Yu Two
 */
public class EmployeeTest {
    
    public EmployeeTest() {
    }
    
    @Test
    public void testSetSalary() {
        System.out.println("setSalary");
        double aSal = 0.0;
        Employee instance = new Employee("Kelly", 10);
        instance.setSalary(aSal);
        Assert.assertEquals(instance.getSalary(), aSal);
    }

    /**
     * Test of getName method, of class Employee.
     */
    @Test
    public void testGetName() {
        System.out.println("setSalary");
        Employee instance = new Employee("Kelly", 10);
        Assert.assertEquals(instance.getName(), "Kelly");
    }

    /**
     * Test of getSalary method, of class Employee.
     */
    @Test
    public void testGetSalary() {
        System.out.println("setSalary");
        Employee instance = new Employee("Kelly", 10);
        Assert.assertEquals(instance.getSalary(), 10);
    }

}
