/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentclasstemplate;

/**
 *
 * @author SUJAL
 */
public class StudentClassTemplate {

    private String name;
    private int Student_id;
    
    public StudentClassTemplate(){}

              
public StudentClassTemplate(String n,int sid){

      this.name = n; 
      this.Student_id=sid;
}
 
   
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public String getName() {
        return name;
    }
    public String setName(String name) {
        this.name = name;
        return name;
         }
      public void setStudent_id(int Student_id) {
        this.Student_id = Student_id;
    }

    public String getStudent_id() {
        return Student_id;
    }
}
     
       
       
    
