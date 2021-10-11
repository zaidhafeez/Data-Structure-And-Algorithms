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
class Range{
    
    int arr[];
    int count;
    public Range(int length) {
        
        arr = new int[length];
    
    }
    
    public void insertElem(int data){
        
        arr[count++] = data;
        
    }
    
    public int range(int size){
        
        sortMaxMin(size);
        
        int min = arr[0];
        int max = arr[size - 1];
        int range = max - min;
        
        return range;
    }
    
    public void sortMaxMin(int size){
        
        int loc_min;
        int temp;
        
        for(int pass = 0; pass <= size - 2; pass++){
            
            loc_min = pass;
            
            for(int i = pass + 1; i < size - 1; i++){
                
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
    
}
public class FindRange {
    
    public static void main(String[] args) {
        System.out.println("Enter size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        Range obj = new Range(size);
        
        System.out.println("Enter element");
        int element;
        for(int i = 0; i < size; i++){
            
            element = sc.nextInt();
            obj.insertElem(element);
            
        }
        
        System.out.println("the range is : " + obj.range(size));
        
        
        
    }
    
}
