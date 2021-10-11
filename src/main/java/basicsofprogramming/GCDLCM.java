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
class Calculate{
    
    public int gcd(int x,int y){
        int remainder = x % y;
        while(remainder != 0){
            x = y;
            y = remainder;
            remainder = x % y;
            
        }
        
        int hcf = y;
        return hcf;
        
        
    }
    
    public int lcm(int x, int y){
        
        int lcm = (x * y) / gcd(x,y);
        
        return lcm;
    }
    
}
public class GCDLCM {
    public static void main(String[] args) {
        System.out.println("Enter Two Number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        Calculate obj = new Calculate();
        int gcd = obj.gcd(x, y);
        int lcm = obj.lcm(x, y);
        
        System.out.println("The gcd and lcm is : " + gcd + " " +lcm);
        
    }
}
