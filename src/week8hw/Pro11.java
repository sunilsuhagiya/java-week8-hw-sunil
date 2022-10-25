package week8hw;

import java.util.Scanner;

// Even Digit Sum
public class Pro11 {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        int lastDigit = 0;
        while (number>0){
            lastDigit = number % 10;
            if (number % 2 ==0){
                sum += lastDigit;
                number /=10;
            }
            else {
                number /=10;
                continue;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int sum = 0;
        sum = getEvenDigitSum(252);
        sum = getEvenDigitSum(123456789);
        sum = getEvenDigitSum(-22);
      System.out.println("Sum of Even Number is : " +sum);
      System.out.println("Sum of Even Number is : " +sum);
      System.out.println("Sum of Even Number is : " +sum);
    }
}
