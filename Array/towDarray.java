package Array;

import java.util.*;
public class towDarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number the rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number the columns : ");
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];

        // For Input
        System.out.println("Enter the numbers : ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        // For Output
        System.out.println("Here are the 2D Array : ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
