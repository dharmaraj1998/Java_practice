
package circle1;

class Circle{
    public double radius;
    public double length;
    public double breath;
    private double height;
    private double diameter;
    
    public double getHeight(){
        return height;
    }
    public void setHeight(double h){
        if(h > 0){
            height = h;
        }else{
            height = 0;
        }
        
    };
    public double getDiameter(){
        return diameter;
    }
    public void setDiameter(double d){
        if(d >0){
            diameter = d;
        }else{
            diameter =0;
        }
    }
    public double area(){
        return Math.PI*radius;
    }
    
    public String isSquare(){
        if(length == breath){
            return "its not a circle";
        }else{
            return "its a square";
        }
    }


}


public class Circle1 {


    public static void main(String[] args) {
        
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        
        c1.breath = 7;
        c1.length = 40;
        c1.radius = 30;
        
        c2.breath =20;
        c2.length =20;
        c2.radius = 20;
        c1.area();
        c1.setDiameter(30);
        c1.getDiameter();
        
        System.out.println("Area of the circle " + c1.area()+ "and " + c1.isSquare());
    }
    
}
