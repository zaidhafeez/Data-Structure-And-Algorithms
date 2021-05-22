/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicsofprogramming;
import java.util.*;

/**
 *
 * @author zaid
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter Age and Sale ");
        Scanner sc = new Scanner(System.in);
        
        int age = sc.nextInt();
        int sale = sc.nextInt();
        int commision;
        
        
        if(age <= 0 && sale <= 0){
            
            System.out.println("age and sale should be positive");
            
        }
        else {
            
            if(sale >= 10000 && sale < 50000){
                
                if(age >= 60){
                    
                    commision = (int) (0.055 * sale);
                    
                }
                else{
                    
                    commision = (int)(0.5 * sale);
                    
                }
                
            }
            else{
                
                if(age < 60){
                    
                    commision = (int) (0.60 * sale);
                    
                }
                else{
                    
                    commision = (int) (0.65 * sale);
                    
                }
                
            }
            
            System.out.println("Commision is: " + commision);
            
        }                
        
    }
    
}
