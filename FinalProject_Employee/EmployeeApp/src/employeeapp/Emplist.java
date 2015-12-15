/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeapp;

import java.util.*;
/**
 *
 * @author Kelly Yu Two
 */
public class Emplist {
    
    public Emplist() {
        empList = new ArrayList<Employee>();
    }
    
    
    public void sortByName(boolean inc) {
        Comparator<Employee> comp = new 
            Comparator<Employee>() {
                public int compare(Employee emp1, Employee emp2) {
                    int i;
                    if(inc) {i=1;} else {i = -1;}
                    return i * emp1.getName().compareTo(emp2.getName());
                }
            };
        Collections.sort(empList, comp);
    }
    
    public void sortBySalary(boolean inc) {
        Comparator<Employee> comp = new
            Comparator<Employee>() {
                public int compare(Employee emp1, Employee emp2) {
                    int i;
                    if (inc) {i = 1;} else {i = -1;}
                    if (emp1.getSalary() < emp2.getSalary()) {
                        return -1 * i;
                    }
                    if (emp1.getSalary() > emp2.getSalary()) {
                        return i;
                    }
                    return 0;
                }
            };
        Collections.sort(empList, comp);
    }
       
    
    private ArrayList<Employee> empList;
    
// - Sort the list by name or by salary using strategy classes.
// - Print the list (all fields)
// - Print all fields of just the Managers, or just the Salaried, or just the Hourly workers.
// - Save the list to a file.
// - Read the list in from a file.
// - Change the OvertimeRate for all Salaried employees in the list.
// - Change the HourlyRate for all Hourly employees in the list.
}
