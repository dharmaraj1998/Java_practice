/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Person;

/**
 *
 * @author ADMIN
 */
public class Person {
    
    // private Fields
    private String name;
    private int age;
    
      // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    };
     // Getter for name
    public String getName() {
        return name;
    }
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
     // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
    
    // Method to display person's details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
      // Main method to test the Person class
    public static void main(String[] args) {
        // Create a new Person object
        Person person = new Person("John Doe", 30);
        
        // Display the person's details
        person.displayDetails();
        
        // Update the person's name and age
        person.setName("Jane Doe");
        person.setAge(25);
        
        // Display the updated details
        person.displayDetails();
    }
    
    
    
}
