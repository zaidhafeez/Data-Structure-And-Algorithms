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
public class CheckPalindrome {
    
    public static void main(String[] args) {
        
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int tempNum = number;
        int revNumber = 0;
        int lsd;
        
        while(tempNum != 0){
            
            lsd = tempNum % 10;
            revNumber = revNumber * 10 + lsd;
            tempNum = tempNum / 10;
            
        }
        
        if(number == revNumber){
            System.out.println("It is Palindrome");
        }
        else{
            System.out.println("It is Not Palindrome");
        }
    }
    
}
