
package threadtest;

//class Mythread extends Thread{
//    @Override
//    public void run(){
//        int i = 1;
//        while(i >0){
//            System.out.println( i + "hello");
//            i++;
//        }
//    }
//}

public class Threadtest extends Thread {
    @Override
    public void run(){
        int i = 1;
        while(i >0){
            System.out.println( i + "hello");
            i++;
        }
    }

 
    public static void main(String[] args) {
        // TODO code application logic here
        Threadtest t = new Threadtest();
        Thread th = new Thread(t);
        th.start();
        int i = 1;
        while(i >0){
            System.out.println( i + "hello");
            i++;
        }
    }
    
}
