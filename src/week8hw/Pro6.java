package week8hw;

import java.util.Scanner;

//Write a program in Java to display the pattern like a triangle with a number.
public class Pro6 {
    public static void main(String[] args) {
number();
    }
    public static void number(){
        int i,j,rows;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        rows = sc.nextInt();

        for(i=1;i<=rows;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println("" );
            sc.close();
        }
    }
}
