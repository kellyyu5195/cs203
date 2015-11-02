/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greeter;

/**
 *
 * @author keyu
 */
public class Greeter {
    /**
      Constructs a Greeter object that can greet a person or entity
      @param aName the name of the person or entity who should
      be addressed in the greetings
    */
    
    public Greeter(String aName)
    { name = aName;
    }
    
    /**
      Greet with "Hello" message.
      @return a message containing "Hello" and the name of the greeted
      person or entity
      
    */
    
    public String sayHello() {
        return "Hello, " + name + "!";
    }
    
    /**
      Sets the greeter name to a new name
      @param someName the new name for the greeter
    */
    public void setName(String someName) {
        name = someName;
    }
    
    /** 
      Swaps another greeter's name and this greeter's name
      @param other is the other greeter
     */
    
    public void swapNames(Greeter other) {
        String oneName = other.name;
        other.setName(this.name);
        this.name = oneName;
    }
    
    /**
      Test the different methods created in the Greeter class
      @return strings to test the methods setName() and swapNames()
     */
        
    public static void main(String[] args) {
        Greeter greeterOne =  new Greeter("World");
        Greeter greeterTwo = greeterOne;
        greeterTwo.setName("Kelly");
        String greetingTwo = greeterTwo.sayHello();
        System.out.println(greetingTwo);
        String greetingOne = greeterOne.sayHello();
        System.out.println(greetingOne);
        
        Greeter greeterThree = new Greeter("Antony");
        Greeter greeterFour = new Greeter ("Adam");
        greeterThree.swapNames(greeterFour);
        String greetingThree = greeterThree.sayHello();
        String greetingFour = greeterFour.sayHello();
        System.out.println(greetingThree);
        System.out.println(greetingFour);
    }
    

    private String name;

}
