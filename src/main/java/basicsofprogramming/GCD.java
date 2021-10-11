/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicsofprogramming;

import java.util.Scanner;

/**
 *
 * @author zaid
 */
public class GCD {
    public static void main(String[] args) {
        
        System.out.println("Enter Two Numbers");
        
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int rem;
        int gcd = 0;
        
        if(x <= 0 && y <= 0){
        
            System.out.println("Enter Positive number");
            
        }
        else{
            
            rem = x % y;
            
            while(rem != 0){
                
                x = y;
                y = rem;
                rem = x % y;
                
            }
            
            gcd = y;
            
        }
        System.out.println("The GCD of Two Number is : " + gcd);
    }
    
}
