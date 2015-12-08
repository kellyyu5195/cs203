/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pair;
import java.io.Serializable;
import java.io.*;
/**
 *
 * @author Kelly Yu Two
 */
public class Pair<E extends Cloneable & Serializable> implements
        Cloneable, Serializable {
    
    /**
     * Pair constructor
     * @param first first object of type E
     * @param second first object of type E
     */
    public Pair(E first, E second) {
        e1 = first;
        e2 = second;
    }
    
    /**
     * Sets the first object
     * @param newVal an object of type E
     */
    public void set1(E newVal) {
        e1 = newVal;
    }
    
    /**
     * Sets the second object
     * @param newVal an object of type E
     */
    public void set2(E newVal) {
        e2 = newVal;
    }

    /**
     * Tells us the first object
     * @return the first object of this Pair e1
     */
    public E get1() {
        return e1;
    }
    
    /**
     * Tells us the second object
     * @return the second object of this Pair e2
     */
    public E get2() {
        return e2;
    }
    
    /**
     * Clone Method
     * @return a clone of this Pair object
     */
    public Pair clone() {
        try {
            return (Pair)super.clone();
        }
        catch (CloneNotSupportedException e) {
            return null;
        }
    }
    
    // Private fields e1 and e1
    private E e1;
    private E e2;
    
}
