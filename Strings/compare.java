package Strings;

import java.util.*;
public class compare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first name : ");
        String name1 = sc.nextLine();
        
        System.out.print("Enter the second name : ");
        String name2 = sc.nextLine();

        if(name1.compareTo(name2) == 0){
            System.out.print("Strings are equal");
        }
        else{
            System.out.print("Strings are not equal");
        }

        sc.close();
    }
}
