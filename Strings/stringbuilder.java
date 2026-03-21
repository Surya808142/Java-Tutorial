package Strings;

// Strings in java are immutable 
// String Builber are mutable


public class stringbuilder {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Surya");
        System.out.println(sb);

        // System.out.print(sb.charAt(0));
        sb.insert(2, "r");
        System.out.println(sb);
    }
}
