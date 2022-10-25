package week8hw;

public class DigitSumChallenge {
 public static int sumDigit(int num){
     if (num <10){
         return -1;
     }
     int sumDigit = 0;
     String numtostring = Integer.toString(num);
     for (char c: numtostring.toCharArray()){
         sumDigit += Integer.parseInt(String.valueOf(c));
             }
     return sumDigit;
 }

    public static void main(String[] args) {

        System.out.println("Sum of 125 is = " + sumDigit(125));
        System.out.println("Sum of 854 is = " + sumDigit(854));
        System.out.println("Sum of 18 is = " + sumDigit(18));
        System.out.println("Sum of -3 is = " + sumDigit(-3));
        sumDigit(0);
    }
    }


