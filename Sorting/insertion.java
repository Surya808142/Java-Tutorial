package Sorting;

import java.util.*;
public class insertion {
    public static void main(String args[]){
        System.out.print("Enter the size of the array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.print("Enter the elements of the array : ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        } 
        sc.close();
    }
}
