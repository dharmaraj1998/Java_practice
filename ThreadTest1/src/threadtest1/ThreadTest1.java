/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threadtest1;

class Mythread extends Thread{
    
    public void run(){
        
        int i = 1;
        while(true){
            System.out.println(i++);
            try{
            Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
                
            }
        }
        
    }
}
public class ThreadTest1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mythread t = new Mythread();
        t.start();
        t.interrupt();
        
        // TODO code application logic here
    }
    
}
