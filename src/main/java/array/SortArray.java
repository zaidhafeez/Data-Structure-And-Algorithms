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

class SortElementSelectionSort{
    
    int arr[];
    int count = 0;
    
    public SortElementSelectionSort(int length) {
        
        arr = new int[length];
        
    }
    
    public void insert(int data){
        
        arr[count++] = data;
        
    }
    
    public void sel_sort(int length){
        
        int loc_min;
        int temp;
        
        for(int pass = 0; pass <= length - 2; pass++){
            
            loc_min = pass;
            
            for(int i = pass + 1; i <= length-1; i++){
                
                if(arr[i] < arr[loc_min]){
                    
                    loc_min = i;
                    
                }
                
            }
            if(loc_min != pass){
                
                temp = arr[pass];
                arr[pass] = arr[loc_min];
                arr[loc_min] = temp;
                
            }
            
        }
    }
    
    public void printArray(){
        
        for(int i = 0; i < arr.length; i++){
            
            System.out.print(arr[i] +" ");
            
        }        
        
    }   
            
}

public class SortArray {
    
    public static void main(String[] args) {
        
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        SortElementSelectionSort obj = new SortElementSelectionSort(size);
        
        System.out.println("Enter the element");
        int element;
        
        for(int i = 0; i < size; i++){
            
            element = sc.nextInt();
            obj.insert(element);
            
        }
        obj.sel_sort(size);
        obj.printArray();
        
    }
    
}
