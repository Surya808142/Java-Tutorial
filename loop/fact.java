package loop;
import java.util.*;

public class fact {
    public static void main(String args[]){
        System.out.print("Enter the value of n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;

        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        System.out.print("Factorial of "+n+" is : " + fact);
        sc.close();
    } 
}
