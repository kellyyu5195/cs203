/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package country;

import java.util.Comparator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import org.junit.Assert;

/**
 *
 * @author keyu
 */
public class CountryTest {
    
    public CountryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getName method, of class Country.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        
        Country country = new Country ("Japan", 8);
        String countryName = country.getName();
        Assert.assertSame("Japan", countryName);
    }

    /**
     * Test of getArea method, of class Country.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        
        Country country = new Country ("Japan", 8);
        double countryArea = country.getArea();
        Assert.assertTrue(countryArea == 8);
    }

    /**
     * Test of compareTo method, of class Country.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        
        Country country1 = new Country("China", 10);
        Country country2 = new Country("Canada", 12);
        
        int result0 = country1.compareTo(country2);
        Assert.assertTrue((result0 < 0));
        
        int result1 = country2.compareTo(country1);
        Assert.assertTrue((result1 > 0));
        
        int result2 = country1.compareTo(country1);
        Assert.assertTrue(result2 == 0); 
    }

    /**
     * Test of createComparatorByName method, of class Country.
     */
    @Test
    public void testCreateComparatorByName() {
        System.out.println("testing createComparatorByName");
        
        Country country1 = new Country("China", 10);
        Country country2 = new Country("Canada", 12);
        
        int result0 = Country.createComparatorByName(true).compare(country1, country2);
        Assert.assertTrue(result0 > 0);
        
        int result1 = Country.createComparatorByName(false).compare(country1, country2);
        Assert.assertTrue(result1 < 0);
        
        int result2 = Country.createComparatorByName(true).compare(country1, country1);
        Assert.assertTrue(result2 == 0);
        
        int result3 = Country.createComparatorByName(false).compare(country1, country1);
        Assert.assertTrue(result3==0);
        
    }

    /**
     * Test of createComparatorByArea method, of class Country.
     */
    @Test
    public void testCreateComparatorByArea() {
        System.out.println("testing createComparatorByArea");
        
        Country country1 = new Country("China", 10);
        Country country2 = new Country("Canada", 12);
        
        int result0 = Country.createComparatorByArea(true).compare(country1, country2);
        Assert.assertTrue(result0 < 0);
        
        int result1 = Country.createComparatorByArea(false).compare(country1, country2);
        Assert.assertTrue((result1 > 0));

        int result2 = Country.createComparatorByArea(true).compare(country1, country1);
        Assert.assertTrue(result2 == 0);
        
        int result3 = Country.createComparatorByArea(false).compare(country1, country1);
        Assert.assertTrue(result3==0);

    }
    
}
