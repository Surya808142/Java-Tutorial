package Strings;

import java.util.*;
public class reverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String : ");
        String input = sc.nextLine();
        StringBuilder name = new StringBuilder(input);

        for(int i=0; i<name.length()/2; i++){
            int front = i;
            int back = name.length()-1-i;

            char frontChar = name.charAt(front);
            char backChar = name.charAt(back);

            name.setCharAt(front, backChar);
            name.setCharAt(back, frontChar);
        }
        System.out.print("Reversed String : "+ name);
        sc.close();
    }
}