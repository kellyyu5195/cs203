/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

public class Tester {
    
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld(21, 19);
        int sum = helloWorld.Adder();
        System.out.println(sum);
    }
    
}
