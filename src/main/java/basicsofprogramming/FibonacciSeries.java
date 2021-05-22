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
public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter How much you want term");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        int sum = 0;
        int term1 = 0;
        int term2 = 1;
        int term = 0;
        
        if(number == 0)System.out.println("the sum is : " + term);
        System.out.print("The Fibonacci Series are : ");
        for(int i = 1; i <= number; i++){
            System.out.print("\t"+ term1);
            sum = sum + term1;
            term = term1 + term2;
            term1 = term2;
            term2 = term;
            
        }
        System.out.println("");
        System.out.println("the Sum is : " + sum);
        
    }
}
