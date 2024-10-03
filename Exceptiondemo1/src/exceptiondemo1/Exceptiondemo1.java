/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptiondemo1;

class UserException extends Exception{
    
@Override
public String toString(){
    return "denaminator zero not acceptable";
}
}



public class Exceptiondemo1 {
    
    static void meth3(){
        try{
            throw new UserException();
        }catch(UserException e){
            System.out.println(e);
            

            
            
        }
        
    }
    static void meth2(){
        meth3();
        
    }
    static void meth1(){
        meth2();
        
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
        meth1();
    }
    
}
