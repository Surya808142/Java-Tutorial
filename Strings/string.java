package Strings;

import java.util.*;
public class string {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your name : ");
        String name = sc.nextLine();
        
        System.out.println("The length of your name is "+ name.length());

        for(int i=0; i<name.length(); i++){
            System.out.println(name.charAt(i));
        }
        
        sc.close();
    }
}
