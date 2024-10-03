/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstracttemplete;

abstract class Super{
    
   public Super(){
    System.out.println("super class");
    }
    
    public void method1(){
        System.out.println("super class method");
    }
    abstract public void meth2();

}
class Sub extends Super{
    
    @Override
    public void meth2(){
            System.out.println("sub class method");
        
    }
}
public class AbstractTemplete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Sub s1 = new Sub();
        s1.meth2();
        // TODO code application logic here
    }
    
}
