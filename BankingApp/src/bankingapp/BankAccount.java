/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankingapp;

/**
 * A bank account with a comparable interface
 */
public class BankAccount implements Comparable<BankAccount>{
    
    /** Constructs a bank account.
     * @param aName the name of the person
     * @param aBalance the balance of the bank account
     */
    public BankAccount(String aName, int aBalance) {
        name = aName;
        balance = aBalance;
    }
    
    /**
     * Gets the name of the account holder
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Gets the balance of the account
     * @return the balance of the account
     */
    public int getBalance() {
        return balance;
    }
    
    /**
     * Compares two bank accounts by balance
     * @param other the other bank account
     * @return a negative number if the balance is smaller
     * area than otherBankAccount, 0 if the balances are the same,
     * a positive number otherwise
     */
    @Override
    public int compareTo(BankAccount other) {
        if (balance < other.balance) return -1;
        if (balance > other.balance) return 1;
        return 0;
    }
    
    private String name;
    private int balance;
}
