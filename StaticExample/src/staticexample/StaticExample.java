
package staticexample;

class Hondacity{
    static long price = 10;
    int a = 2;
    
    static double onroadcarPrice(String city){
        switch(city)
        {
            case "delhi":
                return price+price*0.1;
            case "chennai":
                return price+price*0.9;
            case "dubai":
                return price*9;
               
        }
        
    }
}
public class StaticExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hondacity h1 = new Hondacity();
        System.out.println(h1.onroadcarPrice("delhi"));
        
        // TODO code application logic here
    }
    
}
