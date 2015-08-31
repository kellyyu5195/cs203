/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
/**
 *
 * @author keyu
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public  HelloWorld(int n1, int n2) {
        num1=n1;
        num2=n2;
    }
    
    public int Adder() {
        return num1 + num2;
    }
    
    private int num1;
    private int num2;
    
}
