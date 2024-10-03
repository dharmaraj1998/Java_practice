
package scstatic;
import java.util.Date;

class Student{
    private static String rollNumber;
    
    private static int count = 1;
    
    private static String getInstance(){
        
        
        Date d = new Date();
        String rm = "univ-" +(d.getYear()+1900) +"-" + count;
        count++;
        return rm;
    }
    
    
    
    
    public Student(){
        rollNumber = getInstance();
        
        
    }
    public String getRollNumber(){
        return rollNumber;
    }
}
public class Scstatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        System.out.println(s1.getRollNumber());
        System.out.println(s2.getRollNumber());
        System.out.println(s3.getRollNumber());
        // TODO code application logic here
    }
    
}
