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

class ArrayKLargestSmallest{
    
    int arr[];
    int count;

    public ArrayKLargestSmallest(int length) {
        arr = new int[length];
    }
    
    public void insertElement(int data){
        
        arr[count++] = data;
        
    }
    
    public void sortArrayElement(int length){
        int temp;
        int loc_min;
        for(int pass = 0; pass <= length - 2; pass++){
            
            loc_min = pass;
            for (int i = pass + 1; i <= length - 1; i++) {
                
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
    
    public int largestNumber(int k){
        
        int largest = arr[arr.length - k];
        System.out.println(arr.length);
        
        return largest;
    }
    public int smallestNumber(int k){
        
        int smallest = arr[k - 1];
        
        return smallest;
    }
    
    public void printArrayy(){
        
        for(int i = 0; i < arr.length; i++){
            
            System.out.print(arr[i] + " ");
            
        }
        
    }
    
    
}

public class KLargestSmall {
    
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size  = sc.nextInt();
        System.out.println("Enter Kth largest and smallest number");
        
        int k = sc.nextInt();
        
        ArrayKLargestSmallest obj = new ArrayKLargestSmallest(size);
        
        System.out.println("Enter elemnet in array");
        int element;
        for(int i = 0; i < size; i++){
            
            element = sc.nextInt();
            obj.insertElement(element);
            
            
        }
        
        obj.sortArrayElement(size);
        System.out.println(obj.largestNumber(k));
        System.out.println(obj.smallestNumber(k));
        obj.printArrayy();
        
    }
    
}
