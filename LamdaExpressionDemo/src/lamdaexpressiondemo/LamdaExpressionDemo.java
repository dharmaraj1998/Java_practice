/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lamdaexpressiondemo;

/**
 *
 * @author ADMIN
 */
@FunctionalInterface
interface Mylamda{
        public void display();
    }

//class Demo{
//    
//    public void method1(){
//        Mylamda m = ()->{System.out.println("hello world");};
//        m.display();
//    }
//}
class Uselamda{
    public void method(Mylamda ml){
        ml.display();
    }
}

class Demo{
    
    public void method1(){
    Uselamda us = new Uselamda();
    us.method(()-> {System.out.println("hello");});
    
    }
}

public class LamdaExpressionDemo {
   
    public static void main(String[] args) {       
//        Mylamda m = ()->{System.out.println("hello world");};
//        m.display();
    Demo d = new Demo();
    d.method1();
    
    }
}
