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
public class EmployeeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make a new Emplist
        Emplist emplist = new Emplist();
        
        // create a new GUI
        GUI gui = new GUI();
        
        // set the Emplist of the GUI
        gui.setEmpList(emplist);
        
        //initiate GUI
        gui.initGUI();

    }
    
}
