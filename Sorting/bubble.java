package Sorting;

import java.util.*;

public class bubble{
    public static void printarray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String args[]){
        System.out.print("Enter the size of the array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.print("Enter the elements of the array : ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        } 

        System.out.print("Here are the Sorted array : ");
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
            if(arr[j] < arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
            }
        }
        printarray(arr);
        sc.close();
    }
    
}