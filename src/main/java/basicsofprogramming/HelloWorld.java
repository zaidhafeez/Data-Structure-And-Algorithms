/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicsofprogramming;
import java.util.*;

/**
 *
 * @author zaid
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter X and Y");
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        //Swapping two numbers
//        
//        int temp = x;
//        x = y;
//        y = temp;
//        
//        System.out.println("Swapping x and y are:" + x + " and " + y);
        
        //Swapping two numbers without creating any new variable;
        
        x = x + y;
        y = x - y;
        x = x - y;
        
        System.out.println("Swapping x and y are:" + x + " and " + y);
        
        
        
        
    
        
    }
    
}
