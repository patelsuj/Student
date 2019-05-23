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
public class StudentTester {
    
    public static void main(String args[]){
    
        
        StudentClassTemplate s1 = new StudentClassTemplate("Sujal",2221);
        s1.setName("Sujal");
        StudentClassTemplate s2 = new StudentClassTemplate("Jeel",22 );
       s2.setName("Jeel");
        StudentClassTemplate s3 = new StudentClassTemplate("Divya D",9118);
       s3.setName("Jay");
        
        StudentClassTemplate[] list = new StudentClassTemplate[3];
        list[0]= s1;
        list[1]= s2;
        list[2]= s3;
        
        for(int i = 0; i<list.length;i++){
        System.out.println(list[i].getName()+ list[i].getStudent_id());
        }
        
        
       
    }
}
