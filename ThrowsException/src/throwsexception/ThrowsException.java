/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package throwsexception;

/**
 *
 * @author ADMIN
 */

class Negativevalue extends Exception{
    @Override
    public String toString(){
        return "Negative value or not allowed";
    }
}
public class ThrowsException {
    
    static int area(int a,int b)throws Negativevalue{
        if(a <0 || b < 0) throw new Negativevalue();
        int c;
        c = a*b;
        return c;
    }
    
    static int meth1()throws Negativevalue{
       return area(10,-9);
        
    }

    
    public static void main(String[] args) {
        try{
        System.out.print(meth1());
        }catch(Negativevalue e){
            System.out.println(e);
            
        }
        // TODO code application logic here
    }
    
}
