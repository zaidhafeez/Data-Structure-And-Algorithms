/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Scanner;

/**
 *
 * @author zaid
 */
class BblSort{
    
    int arr[];
    int index;

    public BblSort(int length) {
        
        arr = new int[length];
        
    }
    public void insert(int data){
        
        arr[index++] = data;
        
    }
    
    public void bblSort(int size){
        
        int flag = 0;
        int temp;
        
        for(int pass = 1; pass <= size - 1; pass++){
            
            for(int i = 0; i <= (size - 1 - pass); i++){
                
                if(arr[i] > arr[i+1]){
                    
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = 1;
                    
                }
                
            }
            if(flag == 0){
                break;
            }
        }
        
    }
    
    public void printArray(){
        
        for(int i = 0; i < arr.length; i++){
            
            System.out.print(arr[i] +" ");
            
        } 
        
    }
    
    
    
}
public class BubleSort {
    
    public static void main(String[] args) {
        
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        BblSort obj = new BblSort(size);
        System.out.println("Enter the element in array");
        int element;
        for(int i = 0; i < size; i++){
            
            element  = sc.nextInt();
            obj.insert(element);
            
        }
        
        obj.bblSort(size);
        obj.printArray();
        
    }
    
}
