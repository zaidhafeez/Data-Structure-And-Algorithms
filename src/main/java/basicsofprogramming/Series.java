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
public class Series {
    public static void main(String[] args) {
        System.out.println("Enter How much you want term");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        int term = 1;
        
        System.out.print("Print term :");
        for(int i = 1; i <= number; i++){
            
            
            System.out.print("\t" + term);
            sum = sum + term;
            term = term * (-2);
            
        }
        System.out.println("");
        System.out.println("The sum is " + sum);
    }
    
}
