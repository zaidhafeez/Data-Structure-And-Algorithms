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
class CalculateMinMax{
    
    private int arr[];
    
    public CalculateMinMax(int length){
        
        arr = new int[length];
        
    }
    
    public void getArray(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            
            arr[i] = sc.nextInt();
            
        }
        
    }
    
    public void setArray(){
        
        for(int i = 0; i < arr.length; i++){
            
            System.out.print(arr[i]+" ");
            
        }
        
    }
    
    public int getMin(){
        
        int res = arr[0];
        
        for(int i = 0; i < arr.length; i++){
            
            res = Math.min(res, arr[i]);
            
        }
        
        return res;
        
    }
    
    public int getMax(){
        
        int res = arr[0];
        
        for(int i = 0; i < arr.length; i++){
            
            res = Math.max(res, arr[i]);
            
        }
        
        return res;
        
    }
    
    
    
}
public class MinMaxElement {
    
    public static void main(String[] args) {
        System.out.println("Enter Size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        CalculateMinMax obj = new CalculateMinMax(size);
        obj.getArray();
        obj.setArray();
        System.out.println("");
        System.out.println("The minimum element is : " + obj.getMin());
        System.out.println("The maximum element is : " + obj.getMax());
    }
    
}
