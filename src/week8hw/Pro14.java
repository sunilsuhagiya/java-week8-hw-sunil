package week8hw;

import java.util.Scanner;

public class Pro14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of rows : ");
        int n=sc.nextInt();
        System.out.print("Enter Symbol : ");
        char c = sc.next().charAt(0);
        int i=1;
        int j;
        while(i<=n)
        {
            j=1;
            while(j++<=n-i)
            {
                System.out.print(" ");
            }
            j=1;
            while(j++<=i*2-1)
            {
                System.out.print(c);
            }
            System.out.println();
            i++;
        }
        i=n-1;
        while(i>0)
        {
            j=1;
            while(j++<=n-i)
            {
                System.out.print(" ");
            }
            j=1;
            while(j++<=i*2-1)
            {
                System.out.print(c);
            }
            System.out.println();
            i--;
        }
sc.close();
    }
}
