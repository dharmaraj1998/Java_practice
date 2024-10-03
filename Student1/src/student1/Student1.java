
package student1;

 class Student{
    private String rollNo;
    private String name;
    private String subject;
    private double marks;
    
    public Student(String r,String n,String s,double m){
        this.rollNo = r;
        this.marks = m;
        this.subject = s;
        this.name = n;
        
    
}
    public String getName(){
        return name;
    }
    public String getSubject(){
        return subject;
    }
    public String getRollNo(){
        return rollNo;
    }
    public String getResult(){
        if(marks < 30){
            return "fail";
        }else{
            return "pass";
        }
    }
    
    @Override
    public String toString(){
        
        return "student name is " + getName() + " in the " + getSubject() + " is  " + getResult()+"\n";
    }
}


public class Student1 {

    
    public static void main(String[] args) {
        
        Student s[] = new Student[3];
        s[0] = new Student("s101","sury","MATHS",80);
        s[1] = new Student("s102","DHARMA","MATHS",50);
        s[2] = new Student("s103","VIJAY","MATHS",20);
        
        for(Student result : s){
            System.out.print(result);
        }
        // TODO code application logic here
    }
    
}
