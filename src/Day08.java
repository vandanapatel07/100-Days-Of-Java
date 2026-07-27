import javax.sound.midi.Soundbank;
import java.nio.charset.CharsetEncoder;
import java.util.Scanner;
public class Day08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Program 1: Input And Find String Length...

        System.out.println("PROGRAM 1: STRING LENGTH");
        System.out.println("Enter a string :");
        String text = sc.nextLine();
        System.out.println("Your string is : " + text);
        System.out.println("Lenght of string = " + text.length());


        //-------------------------------------------------------------

        // Program 2: Reverse A String...

        System.out.println("\nPROGRAM 2: REVERSE STRING");
        System.out.println("Enter a string to reverse : ");
        String original = sc.nextLine();
        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        System.out.println("Original String : " + original);
        System.out.println("Reversal String : " + reverse);


        //----------------------------------------------------------

        // Program 3: Check Palindrome String...

        System.out.println("\nPROGRAM 3: PALINDROME CHECK");
        System.out.println("Enter a string :");
        String word = sc.nextLine();
        String reverseword = "";
        for (int i = word.length()-1; i >= 0; i--) {
            reverseword = reverseword + word.charAt(i);
        }
        if (word.equalsIgnoreCase(reverseword)) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is not a Palindrome.");
        }


    //---------------------------------------------------------

    // Program 4: Count Vowels And Consonants...

        System.out.println("\nPROGRAM 4: VOWELS AND CONSONANTS");
        System.out.println("Enter a string: ");
        String input=sc.nextLine();
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = Character.toLowerCase(input.charAt(i));
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Number of Vowels = "+vowels);
        System.out.println("Number of Consonants = "+consonants);
        sc.close();

    }
}
