/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author zaid
 */
class Obtain{
    
    int a[] = new int[10];
    int b[] = new int[10];
    
    Obtain(){
        
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            a[i] = sc.nextInt();
        }
    }
    public int[] getArray(){
        for(int i = 0; i < 10; i++){
          b[i] = a[i];
        }
        return b;
    }
}
public class CreateArray {
    public static void main(String[] args) {
        
        System.out.println("Enter number in array");
        
        Obtain obj = new Obtain();
        // getting element from the array
        int a[] = obj.getArray(); 
        // For Printing array
        for(int i = 0; i < 10; i++){
            System.out.print(a[i] + " ");
        }
    }
    
}
