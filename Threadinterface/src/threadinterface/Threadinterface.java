/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threadinterface;

//class Mytest implements Runnable
//{
//    @Override
//    public void run(){
//        int i = 1;
//        while(i > 0){
//            System.out.println(i + "hello");
//            i++;
//        }
//    }
//}
public class Threadinterface implements Runnable{
    @Override
    public void run(){
        int i = 1;
        while(i > 0){
            System.out.println(i + "hello");
            i++;
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Threadinterface th = new Threadinterface();
        Thread t = new Thread(th);
        t.start();
        int i = 1;
        while(i > 0){
            System.out.println(i + "world");
            i++;
        }
    }
    
}
