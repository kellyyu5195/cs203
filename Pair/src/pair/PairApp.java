/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pair;
import java.awt.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author Kelly Yu Two
 */
public class PairApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // initializing rectangles
        Rectangle r1 = new Rectangle(4, 4);
        Rectangle r2 = new Rectangle(2,3);
        Rectangle r3 = new Rectangle(1,1);
        
        // initializing Pair with Rectangles
        Pair<Rectangle> p = new Pair(r1, r2);
        
        // testing get1() and get2() for Pair<Rectangle> p
        String thing1 = p.get1().toString();
        System.out.println("Object 1: " + thing1);
        String thing2 = p.get2().toString();
        System.out.println("Object 2: " + thing2);
        
        // creating a clone of p
        Pair clone = (Pair)p.clone();
        
        // showing that p and clone have different addresses
        if (p == clone) {
            System.out.println("clone doesn't work");
        } else {
            System.out.println("p and clone have different addresses");
        }
        
        // showing that p and clone have the same e1
        if (p.get1().equals(clone.get1())) {
            System.out.println("First object of p and clone are the same");
        } else {
            System.out.println("clone doesn't work");
        }
        
        // showing that p and clone have the same e2
        if (p.get2().equals(clone.get2())) {
            System.out.println("Second object of p and clone are the same");
        } else {
            System.out.println("clone doesn't work");
        }
        
        // setting e1 and e2 in p to r3
        p.set1(r3);
        p.set2(r3);
        
        // checking that e1 and e2 have changed
        String thing3 = p.get1().toString();
        System.out.println("Object 1 Changed: " + thing3);
        String thing4 = p.get2().toString();
        System.out.println("Object 2 Changed: " + thing4);
        
        // testing serialization for p
        try {
            FileOutputStream fileOut = new FileOutputStream("p.ser");
            ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
            outStream.writeObject(p);
            outStream.close();
            fileOut.close();
        } catch (IOException i) {
            System.out.println(i);
        }
        
        try {
            FileInputStream fileIn = new FileInputStream("p.ser");
            ObjectInputStream inStream = new ObjectInputStream(fileIn);
            Pair<Rectangle> readThis = (Pair<Rectangle>) inStream.readObject();
            System.out.println(readThis);
        } catch (ClassNotFoundException | IOException i) {
            System.out.println(i);
        }
    }
    
}
