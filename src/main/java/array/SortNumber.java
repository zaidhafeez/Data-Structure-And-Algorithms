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
         
        int i, count0 = 0,count1 = 0,count2 = 0;
        
        for(i = 0; i < arr.length; i++){
            
            switch(arr[i]){
                
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
            
            }
            
        }
        
            
        i = 0;
        while(count0 > 0){
            arr[i++] = 0;
            count0--;
        }
        while(count1 > 0){
            arr[i++] = 1;
            count1--;
        }
        while(count2 > 0){
            arr[i++] = 2;
            count2--;
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
