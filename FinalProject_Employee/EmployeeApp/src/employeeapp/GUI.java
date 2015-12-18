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
    
    private JFrame frame; 
    private Emplist empList;
    
    public void initGUI() {
        frame = new JFrame("Employee Manager");
        JPanel displayPanel = new JPanel();
        JPanel userInputPanel = new JPanel();
        JPanel addEmp = new JPanel();
        JPanel printPanel = new JPanel();
        JPanel filePanel = new JPanel();
        
        JTextField disp = new JTextField("");
        
        JLabel inName = new JLabel("Name");
        JLabel salary = new JLabel("Base Salary");
        JLabel bonus = new JLabel("Bonus");
        JLabel otHrLabel = new JLabel("Overtime Hours");
        JLabel otRateLabel = new JLabel ("Overtime Rate");
        JLabel hrlyRateLabel = new JLabel ("Hourly Rate");
        JLabel hrsLabel = new JLabel ("Hours");
        
        JTextField inputName = new JTextField ("");
        JTextField inputSal = new JTextField("");
        JTextField inputBonus = new JTextField("");
        JTextField otHours = new JTextField("");
        JTextField otRate = new JTextField("");
        JTextField hrlyRate = new JTextField("");
        JTextField hrs = new JTextField("");
        
        JButton addManager = new JButton("Add Manager");
        JButton addSalaried = new JButton("Add Salaried");
        JButton addHourly = new JButton("Add Hourly");
        
        JButton printList = new JButton("Print All Employees");
        JButton printManagers = new JButton("Print Managers");
        JButton printSalaried = new JButton("Print Salaried");
        JButton printHourly = new JButton("Print Hourly");
        
        JButton toFile = new JButton("To File");
        JButton fromFile = new JButton("From File");
        
        frame.setLayout(new FlowLayout());
        userInputPanel.setLayout(new FlowLayout());
        addEmp.setLayout(new FlowLayout());
        printPanel.setLayout(new FlowLayout());
        filePanel.setLayout(new FlowLayout());
        
        addEmp.add(addEmployee);
        addEmp.add(addManager);
        addEmp.add(addSalaried);
        addEmp.add(addHourly);
        
        printPanel.add(printList);
        printPanel.add(printManagers);
        printPanel.add(printSalaried);
        printPanel.add(printHourly);
        
        filePanel.add(toFile);
        filePanel.add(fromFile);
        
        frame.add(displayPanel);
        frame.add(addEmp);
        frame.add(printPanel);
        frame.add(filePanel);
        
        addManager.addActionListener((ActionEvent e) -> {
            Manager person = new Manager(inName.getText(),
                    Integer.parseInt(inputSal.getText()),
                    Integer.parseInt(inputBonus.getText()));
            empList.addEmp(person);
        });
        
        addSalaried.addActionListener((ActionEvent e) -> {
            Salaried person = new Salaried(inName.getText(),
                    Integer.parseInt(inputSal.getText()),
                    Integer.parseInt(otHours.getText()),
                    Integer.parseInt(otRate.getText()));
            empList.addEmp(person);
        });
        
        addHourly.addActionListener((ActionEvent e) -> {
            Hourly person = new Hourly(inName.getText(),
                    Integer.parseInt(hrlyRate.getText()),
                    Integer.parseInt(hrs.getText()));
            empList.addEmp(person);
        });
        
    }


        // listeners for buttons, methods from controller 
        lockButton.addActionListener((ActionEvent e) -> {
            guiController.lockedAct();
            minuteButton.setBackground(Color.BLACK);
            hourButton.setBackground(Color.BLACK);
            upButton.setBackground(Color.BLACK);
            downButton.setBackground(Color.BLACK);
        });

        setButton.addActionListener((ActionEvent e) -> {
            guiController.setTimeAct();
            minuteButton.setBackground(Color.PINK);
            hourButton.setBackground(Color.PINK);
            upButton.setBackground(Color.RED);
            downButton.setBackground(Color.RED);
        });

        hourButton.addActionListener((ActionEvent e) -> {
            guiController.setTimeHour();
        });

        minuteButton.addActionListener((ActionEvent e) -> {
            guiController.setTimeMinute();
        });

        upButton.addActionListener((ActionEvent e) -> {
            guiController.upAction();
        });

        downButton.addActionListener((ActionEvent e) -> {
            guiController.downAction();
        });

        alarmSetButton.addActionListener((ActionEvent e) -> {
            this.setAlarm();
        });

        alarmClearButton.addActionListener((ActionEvent e) -> {
            guiController.clearAlarm();
            alarmSetButton.setText("Set Alarm");
        });

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    /**
     * Constructs the GUI components for a new window to set the alarm with
     * drop-down menus.
     */
    public void setAlarm() {
        // initialize new window to set the alarm
        alarmInt = new int[2];
        JFrame alarmFrame = new JFrame();
        alarmFrame.setLayout(new GridLayout(1, 2));
        JComboBox hourComboBox = new JComboBox(hourInts);
        JComboBox minuteComboBox = new JComboBox(minuteInts);
        JButton finishedAlarmButton = new JButton("Set Alarm");
        alarmFrame.add(hourComboBox);
        alarmFrame.add(minuteComboBox);
        alarmFrame.add(finishedAlarmButton);
        alarmFrame.pack();
        alarmFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        alarmFrame.setVisible(true);

        // add the button to set the alarm
        finishedAlarmButton.addActionListener((ActionEvent e) -> {
            alarmInt[0] = (int) hourComboBox.getSelectedItem();
            alarmInt[1] = (int) minuteComboBox.getSelectedItem();
            alarmSetButton.setText("Change Alarm");
            alarmFrame.setVisible(false);
            guiController.setAlarm(alarmInt);
        });

    
}
