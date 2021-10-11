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
public class SumOfIndividualDigit {
    
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        int temp = 0;
        while(number != 0){
            
            temp = number % 10;
            number = number / 10;
            sum = sum + temp;
            
        }
        
        System.out.println("The sum of individual digit is : " + sum);
        
    }
    
}
