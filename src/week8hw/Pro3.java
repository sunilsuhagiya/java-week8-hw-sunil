package week8hw;
/**Write a Java program that takes the user to provide a single character from the  alphabet.
 * Print Vowel of Consonant, depending on the user input. If the user input  Is not a letter
 * (between a and z or A and Z), or is a string of length > 1, print an  error message.
 For eg:
 Input an alphabet: p
 Expected Output:
 Input letter is Consonant
 */

import java.util.Locale;
import java.util.Scanner;

public class Pro3 {
    public static void main(String[] args) {
        Pro3 vowelOfConsonant = new Pro3();
        vowelOfConsonant.vowelConsonant();
    }

    public void vowelConsonant() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Alphabet : ");
        String alphabet = scan.next().toLowerCase(Locale.ROOT);
        boolean uppercase = alphabet.charAt(0) >= 65 && alphabet.charAt(0) <= 90;
        boolean lowercase = alphabet.charAt(0) >= 97 && alphabet.charAt(0) <= 122;
        if (alphabet.length() > 1) {
            System.out.println("Sorry you have entered more than one alphabet");
        } else if (!(uppercase || lowercase)) {
            System.out.println("Sorry you have not entered alphabet");
        } else if (alphabet.charAt(0) == 'a' || alphabet.charAt(0) == 'e' || alphabet.charAt(0) == 'i' ||
                alphabet.charAt(0) == 'o' || alphabet.charAt(0) == 'u' || alphabet.charAt(0) == 'A' ||
                alphabet.charAt(0) == 'E' || alphabet.charAt(0) == 'I' || alphabet.charAt(0) == 'O' ||
                alphabet.charAt(0) == 'U') {
            System.out.println(alphabet + " Alphabet Is Vowel");

        } else System.out.println(alphabet + " Alphabet Is Consonant ");
        scan.close();

    }
}
