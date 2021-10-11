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
class OccurrencesOfNumber{
    
    int arr[];
    int index;
    int count;

    public OccurrencesOfNumber(int length) {
        
        arr = new int[length];
        
    }
    
    public void insertElementInArray(int data){
        
        arr[index++] = data;
        
    }
    
    public int numberOccurrences(int number){
        
        for(int i = 0; i < arr.length; i++){
            
            if(arr[i] == number){
                
                count++;
                
            }
            
        }
        
        return count;
        
    }
    
    
    
    
}

public class Occurrence {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size  = sc.nextInt();
        
        System.out.println("Enter number to find his occurrences");
        
        int number = sc.nextInt();
        
        OccurrencesOfNumber obj = new OccurrencesOfNumber(size);
        
        System.out.println("Enter elemnet in array");
        int element;
        for(int i = 0; i < size; i++){
            
            element = sc.nextInt();
            obj.insertElementInArray(element);
            
            
        }
        
        System.out.println("The Occurrence of number is : " + obj.numberOccurrences(number));
        
    }
    
}
