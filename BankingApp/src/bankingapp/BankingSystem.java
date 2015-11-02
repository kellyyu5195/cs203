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
public class BankingSystem {

    /** Constructs a banking system by implementing a new ArrayList
     */
    public BankingSystem() {
        bankingSystem = new ArrayList<>();
    }
    
    /** Add a bank account to banking system
     * @param account the bank account that is added to the system
     */
    public void addAccount(BankAccount account) {
        bankingSystem.add(account);
    }
    
    /** Sort the accounts in the banking system by balance
     */
    public void sortAccounts() {
        Collections.sort(bankingSystem);
    }
    
    /** Prints out accounts in the banking system
     */
    public void printAccounts(){
        for (BankAccount b: bankingSystem)
            System.out.println(b.getName() + " " + b.getBalance());
    }
    
    private ArrayList<BankAccount> bankingSystem;
    
}
