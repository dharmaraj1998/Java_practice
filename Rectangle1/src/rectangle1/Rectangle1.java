/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangle1;

/**
 *
 * @author ADMIN
 */

 class Rectangle{
    private double length;
    private double breath;
    
    public Rectangle(){
        length =1;
        breath =1;
    }
    
    public Rectangle(double l,double b){
    setLength(l);
    setBreath(b);
}
    public void setLength(double l){
        if(l > 0){
            length = l;
        }else{
            length = 1;
        }
        
    }
    public void setBreath(double b){
        if(b > 0){
            breath = b;
        }else{
            breath = 1;
        }
        
    }
    public double getLength(){
        return length;
    }
    public double getBreath(){
        return breath;
    }
}
public class Rectangle1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle rec7 = new Rectangle();
        Rectangle r1 = new Rectangle(50,60);
        Rectangle r2 = new Rectangle(30,40);
       
        
        System.out.println(r1.getLength());
        System.out.println(r2.getBreath());
        // TODO code application logic here
    }
    
}
