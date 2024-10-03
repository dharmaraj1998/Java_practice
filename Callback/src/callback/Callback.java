
package callback;


interface Member{

 void callBack();
}

class Store{
    Member mem[] = new Member[10];
    int count = 0;
    void register(Member m){
        mem[count++] = m;
        
    }
    void inviateSale(){
        for(int i =0;i <count;i++){
            mem[i].callBack();
        }
    }
}

class Customer implements Member
{
    
    String name;
    
    Customer(String n){
        name = n;
    }
    public void callBack(){
        System.out.println("ok,i will come" + name);
    }
}


public class Callback {

    
    public static void main(String[] args) {
        Store s = new Store();
        Customer c1 = new Customer("john");
        Customer c2 = new Customer("smith");
        s.register(c1);
        s.register(c2);
        s.inviateSale();
        // TODO code application logic here
    }
    
}
