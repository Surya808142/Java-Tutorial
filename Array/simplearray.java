// type[] arrayname = new type[size];

package Array;

import java.util.*;
public class simplearray {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array : ");
    int size = sc.nextInt(); 
    int marks[] = new int[size];
    
    System.out.print("Enter the marks of "+size+" the student : ");
    for(int i=0; i<size; i++){
        marks[i] = sc.nextInt();
    }

    // int x = sc.nextInt();
    
    System.out.println("Here are the marks of Students");
    for(int i=0; i<size; i++){
        System.out.println(marks[i]);
    }
    sc.close();
    }
}
