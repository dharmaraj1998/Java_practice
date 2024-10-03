/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringpractice;

/**
 *
 * @author ADMIN
 */
public class Stringpractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str1 = "java";
        
        String str2 = new String("Java");
        
        byte b[] = {66,65,66,78};
        char c[]= {'h','e','l','l','o'};
//        String str3 = new String(b);
        String str4 = new String(c);
        
        
        System.out.println(str1!=str2);
    }
    
}
