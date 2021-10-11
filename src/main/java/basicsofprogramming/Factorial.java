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
class CalcFactorial{
    public int fact(int x){
        int f = 1;
        for(int i = 2; i <= x; i++){
            
            f = f * i;
            
        }
        System.out.println(f);
        return f;
        
    }
}


public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter N And R");
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int r = sc.nextInt();
        
        CalcFactorial cf = new CalcFactorial();
        int bc = cf.fact(n) / (cf.fact(r) * cf.fact(n - r));
        
        System.out.println("The binomial coefficient is " + bc);
        
    }
}
