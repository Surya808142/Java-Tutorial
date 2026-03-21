package Functions;

import java.util.*;

public class sum {
    public static void add(int a, int b, int c){
        int sum = a + b + c;
        System.out.print(sum);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        add(a, b, c);
        sc.close();
    }
}
