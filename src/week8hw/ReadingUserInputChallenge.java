package week8hw;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        while (count<=10){
            System.out.println("Enter number # " + count);

            boolean validNumber = scan.hasNextInt();
            if (validNumber){
                int num = scan.nextInt();
                sum += num;
                count++;
            }else {
                System.out.println("Invalid Number");
            }
            scan.nextInt();

        }
        System.out.println("The Sum of all 10 numbers is =   " + sum);
        scan.close();
    }
}
