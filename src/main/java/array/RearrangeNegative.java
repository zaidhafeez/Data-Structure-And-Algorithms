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
class Rearrange{
    
    int arr[];
    int index;

    public Rearrange(int length) {
        
        arr = new int[length];
        
    }
    public void insert(int data){
        
        arr[index++] = data;
        
    }
    
    public void rearrange(int size){
        
        int j = 0,temp;
        
        for(int i = 0; i < size; i++){
            
            if(arr[i] < 0){
                
                if(i != j){
                    
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    
                }
                
                j++;
                
            }
            
        }
        
    }
    
    public void printArray(){
        
        for(int i = 0; i < arr.length; i++){
            
            System.out.print(arr[i] +" ");
            
        } 
        
    }
    
    
}
public class RearrangeNegative {
    public static void main(String[] args) {
        
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        Rearrange obj = new Rearrange(size);
        System.out.println("Enter the element in array");
        int element;
        for(int i = 0; i < size; i++){
            
            element  = sc.nextInt();
            obj.insert(element);
            
        }
        
        obj.rearrange(size);
        obj.printArray();
        
    }
    
}
