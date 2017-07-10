/**
 * Created by fhani on 7/7/2017.
 */
public class question1 {
    public static void main(String[] args) {
        String sentence = "How many vowels in this string?"
        String word = "";
        int sum = 0;
        switch (word) {
            case "How": {
                while (isVowel("How")) {
                    sum = sum + 1;
                }

            }
                case "many": {
                    while (isVowel("many")) {
                        sum = sum + 1;
                    }

                }
                case "vowels": {
                        case "many": {
                            while (isVowel("many")) {
                                sum = sum + 1;
                            }
                        }
                        case "in": {
                            while (isVowel("in")) {
                                sum = sum + 1;
                            }

                        }

                        case "this": {
                            while (isVowel("this")) {
                                sum = sum + 1;
                            }

                        }
                            case "string": {
                                while (isVowel("string")) {
                                    sum = sum + 1;
                                }

                            }}

}}

    public static boolean isVowel(String sentence) {

        String word = "";
        for (int i = 0; i < word.length(); i++) {

            if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' ||
                    sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o' ||
                    sentence.charAt(i) == 'u') {
                return true; //other ways to do this -- regex
            }
        }
        return false; //doesn't get to this because if statement true
    }
}

