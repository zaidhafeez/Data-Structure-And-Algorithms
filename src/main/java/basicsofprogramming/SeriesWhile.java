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
public class SeriesWhile {
    public static void main(String[] args) {
        System.out.println("Enter Maxterm");
        
        Scanner sc = new Scanner(System.in);
        int maxTerm = sc.nextInt();
        
        int sum = 0;
        int i = 1;
        int term = i * (i + 1);
        
        while(term <= maxTerm){
            
            if(i == 1){
                
                System.out.println(term);
                
            }
            
            sum = sum + term;
            i++;
            term = i * (i + 1);
            System.out.println(" " + term);
            
        }
        System.out.println("The sum of series is :" + sum);
    }
}
