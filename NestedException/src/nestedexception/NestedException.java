/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nestedexception;

/**
 *
 * @author ADMIN
 */
public class NestedException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[]={50,10,30,20,0};
        try{
        int b = a[0]/a[4];
        
        System.out.println(b);
        try{
        System.out.println(a[10]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array index is not exist" + e);
        }
        }catch(ArithmeticException e){
            System.out.println("denaminator not should be zero" + e.getMessage());
        }
        System.out.println("end");
    }
    
}
