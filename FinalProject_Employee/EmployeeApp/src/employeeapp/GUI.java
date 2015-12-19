/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employeeapp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Kelly Yu Two
 */
public class GUI {
    
    /**
     * Constructor of GUI
     */
    public GUI() {
    }
    
    /**
     * Sets the Emplist of the GUI
     * @param e an Emplist for GUI
     */
    public void setEmpList (Emplist e) {
        empList = e;
    }
    
    /**
     * Initializes a GUI
     */
    public void initGUI() {
        
        // Set frame
        frame = new JFrame("Employee Manager");
        
        // Creating Panels
        JPanel displayPanel = new JPanel();
        JPanel userInputPanel = new JPanel();
        JPanel addEmp = new JPanel();
        JPanel printPanel = new JPanel();
        JPanel sortPanel = new JPanel();
        JPanel filePanel = new JPanel();
        
        // Creating Labels
        JLabel inName = new JLabel("Name");
        JLabel salary = new JLabel("Base Salary");
        JLabel bonus = new JLabel("Bonus");
        JLabel otHrLabel = new JLabel("Overtime Hours");
        JLabel otRateLabel = new JLabel ("Overtime Rate");
        JLabel hrlyRateLabel = new JLabel ("Hourly Rate");
        JLabel hrsLabel = new JLabel ("Hours");
        
        // Creating Input Areas
        JTextArea inputName = new JTextArea(4, 25);
        JTextArea inputSal = new JTextArea(4, 25);
        JTextArea inputBonus = new JTextArea(4, 25);
        JTextArea otHours = new JTextArea(4, 25);
        JTextArea otRate = new JTextArea(4, 25);
        JTextArea hrlyRate = new JTextArea(4, 25);
        JTextArea hrs = new JTextArea(4, 25);
        
        // Creating Buttons
        JButton addManager = new JButton("Add Manager");
        JButton addSalaried = new JButton("Add Salaried");
        JButton addHourly = new JButton("Add Hourly");
        
        JButton printList = new JButton("Print All Employees");
        JButton printManagers = new JButton("Print Managers");
        JButton printSalaried = new JButton("Print Salaried");
        JButton printHourly = new JButton("Print Hourly");
        
        JButton sortListNameInc = new JButton("Sort Employees By Name Inc");
        JButton sortListNameDec = new JButton("Sort Employees By Name Dec");
        JButton sortSalaryInc = new JButton("Sort Employees By Salary Inc");
        JButton sortSalaryDec = new JButton("Sort Employees By Salary Dec");
        
        JButton toFile = new JButton("To File");
        JButton fromFile = new JButton("From File");
        
        // Set Layouts
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        userInputPanel.setLayout(new FlowLayout());
        addEmp.setLayout(new FlowLayout());
        printPanel.setLayout(new FlowLayout());
        sortPanel.setLayout(new FlowLayout());
        filePanel.setLayout(new FlowLayout());
        
        
        // Add Components to Panels
        userInputPanel.add(inName);
        userInputPanel.add(inputName);
        userInputPanel.add(salary);
        userInputPanel.add(inputSal);
        userInputPanel.add(bonus);
        userInputPanel.add(inputBonus);
        userInputPanel.add(otHrLabel);
        userInputPanel.add(otHours);
        userInputPanel.add(otRateLabel);
        userInputPanel.add(otRate);
        userInputPanel.add(hrlyRateLabel);
        userInputPanel.add(hrlyRate);
        userInputPanel.add(hrsLabel);
        userInputPanel.add(hrs);      
                
        addEmp.add(addManager);
        addEmp.add(addSalaried);
        addEmp.add(addHourly);
        
        printPanel.add(printList);
        printPanel.add(printManagers);
        printPanel.add(printSalaried);
        printPanel.add(printHourly);
        
        sortPanel.add(sortListNameInc);
        sortPanel.add(sortListNameDec);
        sortPanel.add(sortSalaryInc);
        sortPanel.add(sortSalaryDec);
        
        filePanel.add(toFile);
        filePanel.add(fromFile);
        
        // Add Panels to frame
        frame.add(displayPanel);
        frame.add(userInputPanel);
        frame.add(addEmp);
        frame.add(printPanel);
        frame.add(sortPanel);
        frame.add(filePanel);
        
        
        // Creating Action Listeners for Buttons
        addManager.addActionListener((ActionEvent e) -> {
            Manager person = new Manager(inputName.getText(),
                    Integer.parseInt(inputSal.getText()),
                    Integer.parseInt(inputBonus.getText()));
            empList.addEmp(person);
        });
        
        addSalaried.addActionListener((ActionEvent e) -> {
            Salaried person = new Salaried(inputName.getText(),
                    Integer.parseInt(inputSal.getText()),
                    Integer.parseInt(otHours.getText()),
                    Integer.parseInt(otRate.getText()));
            empList.addEmp(person);
        });
        
        addHourly.addActionListener((ActionEvent e) -> {
            Hourly person = new Hourly(inputName.getText(),
                    Integer.parseInt(hrlyRate.getText()),
                    Integer.parseInt(hrs.getText()));
            empList.addEmp(person);
        });
        
        
        printList.addActionListener((ActionEvent e) -> {
            empList.printList();
        });
        
        printManagers.addActionListener((ActionEvent e) -> {
            empList.printManagers();
        });
        
        printSalaried.addActionListener((ActionEvent e) -> {
            empList.printSalaried();
        });
        
        printHourly.addActionListener((ActionEvent e) -> {
            empList.printHourly();
        });
        
                
        sortListNameInc.addActionListener((ActionEvent e) -> {
            empList.sortByName(true);
        });
        
        sortListNameDec.addActionListener((ActionEvent e) -> {
            empList.sortByName(false);
        });
        
        sortSalaryInc.addActionListener((ActionEvent e) -> {
            empList.sortBySalary(true);
        });
        
        sortSalaryDec.addActionListener((ActionEvent e) -> {
            empList.sortBySalary(false);
        });
        
        toFile.addActionListener((ActionEvent e) -> {
            empList.outputFile();
        });
        
        fromFile.addActionListener((ActionEvent e) -> {
           empList.inputFileStream();
        });
        
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    
    private JFrame frame; 
    private Emplist empList;
}
