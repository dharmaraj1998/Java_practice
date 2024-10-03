
package innerclass;

class Outer{
    int x = 4;
    
    class Inner{
        int y = 8;
       public void innerDisplay(){
            System.out.println(x);
            System.out.println(y);
        }
    }
    public void outerMethod(){
        Inner i = new Inner();
        System.out.println(i.y);
    }
}
public class Innerclass {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Outer o = new Outer();
        System.out.println(o.x);
        o.outerMethod();
        Outer.Inner a = new Outer().new Inner();
        System.out.println(a.y);
        
        
    }
    
}
