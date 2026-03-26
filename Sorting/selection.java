package Sorting;

import java.util.*;
public class selection {
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

        System.out.print("Here are the sorted array : ");
        for(int i=0; i<arr.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printarray(arr);
        sc.close();
    }
}
