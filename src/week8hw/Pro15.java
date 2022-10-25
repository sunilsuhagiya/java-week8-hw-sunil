package week8hw;

import java.util.Scanner;

// Display left angle triangle of * using nested for loops
public class Pro15 {
    public static void main(String[] args) {
        star();

    }
    public static void star(){
        int i,j,rows;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        rows = sc.nextInt();

        for(i=1;i<=rows;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            sc.close();
        }
    }
}
