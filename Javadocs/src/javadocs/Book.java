/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadocs;
/**
 * @author Dharma
 * @version 2.3
 * @since 2003
 * Class for library book
 * 
 */

public class Book {
    /**
     * @value 10 default value
     * 
     */
    
    static int a = 10;
    /**
     * Parametrized constructor
     * @param s book name
     */
    
   public Book(String s){
        
    }
   /**
    * 
    * @param str book is available or not
    * @return if book is available return true or else false
    */
   public boolean available(String str){
       return true;
   }
   /**
    * Issue a book to student
    * @param a student roll number
    * @throws Exception if book is not there then throws exception
    */
   public void issue(int a)throws Exception{
       
   }
   /**
    * get book name
    * @param id book id
    * @return return book name
    */
   public String getName(int id){
       return "";
   }
    
}
