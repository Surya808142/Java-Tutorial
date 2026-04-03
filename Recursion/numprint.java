package Recursion;

import java.util.*;
public class numprint{
    public static void printnum(int n){
        if(n==0) return;
        System.out.println(n);
        printnum(n-1);
    }
    public static void main(String args[]){
        System.out.print("Enter the value of n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printnum(n);
        sc.close();
    }
}

