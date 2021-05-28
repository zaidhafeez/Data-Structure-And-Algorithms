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
class SortZeroOneTwo{
    
    int arr[];
    int index;
    int count;
    
    public SortZeroOneTwo(int length) {
        
        arr = new int[length];
        
    }
    
    public void insertElementInArray1(int data){
        
        arr[index++] = data;
        
    }
    
    public void sortEl(){
        
        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i] == 0){
                
                arr[count] = 0;
                count++;
                System.out.println("The count of 0 " + count);
                
            }
            
        }
        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i] == 1){
                
                arr[count--] = 1;
                count++;
                System.out.println("The count of 1 " + count);
                
            }
            
        }
        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i] == 2){
                
                arr[count--] = 2;
                count++;
                System.out.println("The count of 2" + count);
                
            }
            
        }
        
    }
    
    public void printSorted(){
        
        for(int i = 0; i < arr.length; i++){
            
            System.out.print(arr[i] + " ");
            
        }
        
        
    }
    
    
    
}
public class SortNumber {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size  = sc.nextInt();
        
        SortZeroOneTwo obj = new SortZeroOneTwo(size);
        
        System.out.println("Enter elemnet in array");
        int element;
        for(int i = 0; i < size; i++){
            
            element = sc.nextInt();
            obj.insertElementInArray1(element);
            
            
        }
        
        obj.sortEl();
        obj.printSorted();
        
    }
}
