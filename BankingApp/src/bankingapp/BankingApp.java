/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankingapp;
import java.util.*;
/**
 *
 * @author Kelly Yu Two
 */
public class BankingApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BankingSystem bankAccounts = new BankingSystem();
        bankAccounts.addAccount(new BankAccount("Nick", 3000000));
        bankAccounts.addAccount(new BankAccount ("Olivia", 2000000));
        bankAccounts.addAccount(new BankAccount("Naa", 1500000));
        bankAccounts.addAccount(new BankAccount("Joseph", 1300000));
        
        bankAccounts.printAccounts();
        bankAccounts.sortAccounts();
        System.out.println();
        bankAccounts.printAccounts();

    }
    
}
