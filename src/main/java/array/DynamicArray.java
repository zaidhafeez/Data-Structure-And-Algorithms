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
class Array{
    
    private int arr[];
    private int count;
    
    public Array(int length){
        
        arr = new int[length];
    
    }
    
    public void printArray(){
    
        for(int i = 0; i < count; i++){
            
            System.out.print(arr[i] + " ");
            
        }
    
    }
    
    public void insert(int element){
        
        if(arr.length == count){
            
            int newArr[] = new int[2 * count];
            
            for(int i = 0; i < count; i++){
                
                newArr[i] = arr[i];
                
            }
            // Assigning new array to original array
            // created above
            
            arr = newArr;
           
            
        }
        
        arr[count++] = element;
        
    }
    
    public boolean checkElement(int checkNumber){
        
        boolean found = false;
        
        for(int i = 0 ; i < count; i++){
            
            if(arr[i] == checkNumber){
                
                found = true;
                break;
                
            }
            else{
                
                found = false;
                
            }
            
        }
        
        return found;
        
    }
    
}
public class DynamicArray {
    
    public static void main(String[] args) {
        
        System.out.println("Enter the size of array");
        
        
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        
        
        
        Array obj = new Array(size);
        
        int element;
        System.out.println("Enter Element");
        
        for (int i = 0; i < size; i++){
            
           element = sc.nextInt();
           obj.insert(element);
           
        }
        
        
        System.out.println("Enter Check Number");
        int checkNumber = sc.nextInt();
        obj.printArray();
        System.out.println("");
        System.out.println(obj.checkElement(checkNumber));
        
        
    }
    
}
