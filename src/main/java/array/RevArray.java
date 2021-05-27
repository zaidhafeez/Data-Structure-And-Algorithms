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
class ArrayRev{

    int arr[];
    int start;
    int end;
    int count;
    
    public ArrayRev(int length){
    
        arr = new int[length];
        start = 0;
        end = length - 1;
        
    }
    
    public void setArr(int data){
        
        
        arr[count++] = data;
        
        
        
        
    }
    
    public void revArray(){
        
        int temp;
        
        while(start < end){
            
            
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
            
        }
        
    }
    
    public void printArray(){
        
        for(int i = 0; i < arr.length; i++){
            
            System.out.print(arr[i] +" ");
            
        }        
        
        
    }
    
    
    
    
}
public class RevArray {
    public static void main(String[] args) {
        System.out.println("Enter Size Of Array");
        
        Scanner sc = new Scanner(System.in);
        
        int size  = sc.nextInt();
        
        ArrayRev obj = new ArrayRev(size);
        
        for(int i = 0; i < size; i++){
            
            int element = sc.nextInt();
            obj.setArr(element);
            
        }
        
        obj.revArray();
        obj.printArray();
        
        
        
    }
    
}
