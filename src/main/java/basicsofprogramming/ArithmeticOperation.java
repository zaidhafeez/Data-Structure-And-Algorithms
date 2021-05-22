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
public class ArithmeticOperation {
    public static void main(String[] args) {
        System.out.println("Enter Two Numbers");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = 0;
        
        
        System.out.println("Enter Operation");
        String op = sc.next();
        
        switch(op){
            
            case "+":
                result = num1 + num2;
                
                break;
            case "-":
                result = num1 - num2;
                break;   
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 + num2;
                break;
            case "^":
                result = (int)Math.pow(num1, num2);
                break;
                
            default:
                System.out.println("input is wrong");
            
        }
        System.out.println("The result is :" + result);
        
    }
    
}
