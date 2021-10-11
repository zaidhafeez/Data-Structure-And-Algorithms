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
public class CalculateFactorial {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int fact = 1;
        
        for(int i = 2; i <= number; i++){
            
            fact = fact * i;
            
        }
        System.out.printf("The factorial of %d is %d",number,fact);
    }
    
}
