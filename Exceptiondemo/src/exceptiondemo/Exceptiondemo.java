/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptiondemo;

/**
 *
 * @author ADMIN
 */
public class Exceptiondemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a,b,c,d;
       
        a = 10;
        b = 0;
        d = a+b;
         try{
        c = a/b;
        System.out.println(c);
        System.out.println(d);
        
        }catch(ArithmeticException e){
            System.out.println("o is not divided by any number" + e);
        }
        System.out.println("bye");
        System.out.println(d);
        
         
        
      
    }
    
}
