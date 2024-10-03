
package circle01;

class Circle{
    public double length;
    
    public double getArea(){
        return Math.PI*length;
        
    }
    public double Permeiter(){
        return length*length;
    }
    public double diameter(){
        return getArea()*2;
    }
    
}

class Cylinder extends Circle{
    private double height;
    
    public double radius(){
        return length*getArea();
    }
    
}

public class Circle01 {

    public static void main(String[] args) {
        // TODO code application logic here
        Cylinder c1= new Cylinder();
        c1.length = 30;
        System.out.println(c1.getArea());
        
    }
    
}
