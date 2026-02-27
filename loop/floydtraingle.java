package loop;

import java.util.*;
public class floydtraingle {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x=1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }
        sc.close();
    }
}
