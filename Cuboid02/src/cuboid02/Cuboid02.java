/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuboid02;

class Circle{
   public Circle(){
    System.out.println("circle constructor");
    
}
   public Circle(int l){
        System.out.println("paramized circle constructor");
    }
}

class Cuboid extends Circle{
    
    public Cuboid(){
        System.out.println("cuboid constructor");
    }
    public Cuboid(int l){
        super(l);
        System.out.println("paramized cuboid constructor");
    }
}
public class Cuboid02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cuboid c = new Cuboid(3);
        
        
        // TODO code application logic here
    }
    
}
