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
public class ConversionTemperature {
    public static void main(String[] args) {
        
        System.out.println("Enter Your Choice");
        System.out.println("Press 1 for To convert temperature from Farenheit to Celcius");
        System.out.println("Press 2 for To convert temperature from Celcius to Farenhiet");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        
        if(choice == 1){
            
            System.out.println("enter farenhiet");
            int farenhiet = sc.nextInt();
            int celcius;
            celcius = (int) ((farenhiet - 32)/1.8);
            
            System.out.println("The celcious is : " + celcius);
            
            
        }
        else if(choice == 2){
            
            System.out.println("enter celcius");
            int celcius = sc.nextInt();
            int farenhiet;
            farenhiet = (int) 1.8 * celcius + 32;
            
            System.out.println("The farenhiet is : " + farenhiet);
            
            
        }
        
    }
    
}
