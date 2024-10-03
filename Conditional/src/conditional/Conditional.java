/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conditional;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Conditional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        if(number > 0){
            System.out.println("your entered number is positive " + number);
        }else{
            System.out.println("your entered number is negative" + number);
        }
        
        
        
        // TODO code application logic here
    }
    
}
