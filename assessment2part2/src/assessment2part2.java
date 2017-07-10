import java.util.Scanner;

/**
 * Created by fhani on 7/7/2017.
 */
public class assessment2part2 {
    public static void main(String[] args) {
        final String VOWELS = "aeiou";
        int sum = 0;
        String word = "";
        switch (word) {
            case "How":
                while (word.contains(VOWELS)) {
                    sum = sum + 1;
                    System.out.println(sum);
                }


            case "many":
                while (word.contains(VOWELS)) {
                    sum = sum + 1;
                }


            case "vowels":
                while (word.contains(VOWELS)) {
                    sum = sum + 1;
                }


            case "in":
                while (word.contains(VOWELS)) {
                    sum = sum + 1;
                }

            case "this":
                while (word.contains(VOWELS)) {
                    sum = sum + 1;
                }

            case "string":
                while (word.contains(VOWELS)) {
                    sum = sum + 1;
                }



        }
        System.out.println(sum);
    }


    public static boolean isVowel(String userInput) {
        if (userInput.charAt(0) == 'a' || userInput.charAt(0) == 'e' ||
                userInput.charAt(0) == 'i' || userInput.charAt(0) == 'o' ||
                userInput.charAt(0) == 'u') {
            return true; //other ways to do this -- regex
        }
        return false; //doesn't get to this because if statement true
    }}

