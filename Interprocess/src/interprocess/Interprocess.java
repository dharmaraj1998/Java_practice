
package interprocess;

class Mydata{
    int count;
    boolean flag = true;
    
    synchronized public void set(int x){
        while(flag!= true)
            try{
            wait(10000);
            }catch(Exception e){}
        count = x;
        flag = false;
        notify();
    }
    synchronized public int get(){
        int x;
        while(flag!= false)
            try{
            wait(10000);
            }catch(Exception e){}
        
        x = count;
        flag = true;
        notify();
        return x;
        
    }
}


class Producer extends Thread{
    
   Mydata d;
   public Producer(Mydata data){
       this.d = data;
   }
  public void run(){
        int i = 1;
   while(true){
    d.set(i);
    System.out.println("producer" + i);
    i++;
}
  }
}
class Consumer extends Thread{
    Mydata d;
   public Consumer(Mydata data){
        this.d = data;
    }
   public void run(){
       int value;
       while(true){
           value = d.get();
           System.out.println("consumer" + value);
       }
   }
   
    
}


public class Interprocess {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Mydata d = new Mydata();
        Producer p = new Producer(d);
        Consumer c = new Consumer(d);
        p.start();
        c.start();
    }
    
}
