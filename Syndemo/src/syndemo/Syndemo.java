/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package syndemo;

class Display{
    synchronized void display(String message){
       
       
        for(int i=0;i<message.length();i++){
            System.out.println(message.charAt(i));
        }
      
        
    }
}

class Mythread1 extends Thread{
    Display d;
    Mythread1(Display d){
        this.d = d;
    }
    public void run(){
        d.display("Hello world");
    }
}
class Mythread2 extends Thread{
    Display d;
    Mythread2(Display d){
        this.d = d;
    }
    public void run(){
        d.display("Welcome");
    }
}

public class Syndemo {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Display data = new Display();
        Mythread1 d1 = new Mythread1(data);
        Mythread2 d2 = new Mythread2(data);
        
        d1.start();
        d2.start();
                
    }
    
}
