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
class CalcAvg{
    
    int sum;
    int average;
    
    public int avg(int x,int y, int z){
        sum = x + y + z;
        average = sum / 3;
        return average;
    }
    
}
public class Average {
    public static void main(String[] args) {
        System.out.println("Enter Three Numbers");
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        CalcAvg ca = new CalcAvg();
        int p = ca.avg(a,b,c);
        
        System.out.println("The average is " + p);
        
    }
}
