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
public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int rev = 0;
        int lsd;
        while(number != 0){
            
            lsd = number % 10;
            rev = (rev * 10) + lsd;
            number = number / 10;
            
        }
        System.out.println("The reverse number is : " + rev);
    }
}
