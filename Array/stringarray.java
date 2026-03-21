package Array;

import java.util.*;
public class stringarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        String name[] = new String[size];

        System.out.println("Enter the name of "+size+" Students ");
        for(int i=0; i<size; i++){
            name[i] = sc.next();
        }

        System.out.println("Here are the names of Student ");
        for(int i=0; i<size; i++){
            System.out.println("Name of "+(i+1)+"st student is :"+name[i]);
        }
        sc.close();
    }
}
