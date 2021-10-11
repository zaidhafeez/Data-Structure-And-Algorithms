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

class CompareNumber{
    
    int smallNumber;
    int bigNumber;
    
    public int smallNumber(int x, int y, int z){
        if(x < y){
            if(x < z){
                smallNumber = x;
            }
            else{
                smallNumber = z;
            }
        }
        else{
            if(y < z){
                smallNumber = y;
            }
            else{
                smallNumber = z;
            }
        }
        return smallNumber;
    }
    public int bigNumber(int x, int y, int z){
        if(x > y){
            if(x > z){
                bigNumber = x;
            }
            else{
                bigNumber = z;
            }
        }
        else{
            if(y > z){
                bigNumber = y;
            }
            else{
                bigNumber = z;
            }
        }
        return bigNumber;
    }
    
}
public class Compare {
    
    public static void main(String[] args) {
        System.out.println("Enter Three Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        CompareNumber cn = new CompareNumber();
        int smallNumber = cn.smallNumber(a, b, c);
        int bigNumber = cn.bigNumber(a, b, c);
        
        System.out.println("The Smallest Number is : " + smallNumber);
        System.out.println("The biggest Number is : " + bigNumber);
    }
    
}
