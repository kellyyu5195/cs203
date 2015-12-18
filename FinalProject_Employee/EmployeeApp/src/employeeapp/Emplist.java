/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeapp;

import java.util.*;
import java.io.*;
/**
 *
 * @author Kelly Yu Two
 */
public class Emplist {
    
    public Emplist() {
        empList = new ArrayList<Employee>();
    }
    
    public void addEmp(Employee e) {
        empList.add(e);
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
       
    public void printList() {
        for (Employee e: empList){
            String curEmp = e.toString();
            System.out.println(curEmp);
        }
    }
    
    public void printManagers() {
        for (Employee e: empList) {
            if (e instanceof Manager) {
                String currEmp = e.toString();
                System.out.println(currEmp);
            }
        }
    }
    
    public void printSalaried() {
        for (Employee e: empList) {
            if (e instanceof Salaried) {
                String currEmp = e.toString();
                System.out.println(currEmp);
            }
        }
    }
    
    public void printHourly() {
        for (Employee e: empList) {
            if (e instanceof Hourly) {
                String currEmp = e.toString();
                System.out.println(currEmp);
            }
        }
    }

    public void changeOvertimeRate(double otRate) {
        for (Employee e: empList) {
            if (e instanceof Salaried) {
                ((Salaried) e).setOvertimeRate(otRate); 
            }
        }
    }
    
    public void changeHourlyRate(double hrlyRate) {
        for (Employee e: empList) {
            if (e instanceof Hourly) {
                ((Hourly) e).setHourlyRate(hrlyRate);
            }
        }
    }
    
    public void outputFile() {
        try {
            FileOutputStream fileOut = new FileOutputStream("emp.Stream");
            ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
            outStream.writeObject(this.toString());
            outStream.close();
            fileOut.close();
        } catch (IOException i) {
            System.out.println(i);
        }
    }
    
    public void inputFileStream () {
        try {
            FileInputStream fileIn = new FileInputStream("p.ser");
            ObjectInputStream inStream = new ObjectInputStream(fileIn);
            Emplist readThis = (Emplist) inStream.readObject();
            System.out.println(readThis);
        } catch (ClassNotFoundException | IOException i) {
            System.out.println(i);
        }
    }
    
    
    private ArrayList<Employee> empList;

}
