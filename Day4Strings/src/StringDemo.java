import javax.sound.midi.Soundbank;

/**
 * Created by fhani on 6/29/2017.
 */
public class StringDemo {
    public static void main(String[] args) {
        String name = "Antonella" + " " + "Solomon";
        System.out.println(name);

        String name2 = "Antonella";
        name2 += " Solomon";
        System.out.println(name2);

        String name3 = name.concat(" new string");
        System.out.println(name3);

        String product = "Java";
        int strLength = product.length();
        System.out.println(strLength);

        String fullName = "Farha Hanif";
        int indexOfSpace = fullName.indexOf(" ");
        System.out.println(indexOfSpace);

        String name5 = "Eric Mackey";
        System.out.println(name5.substring(0,2));

        String trimTest = "       y      ";
        System.out.println("My trimTest variable original length is: " + trimTest.length());
        System.out.println(trimTest.trim().length());

        String caseEx = "Antonella";
        System.out.println(caseEx.toLowerCase());






    }
}
