import java.util.Scanner;

/**
 * Created by fhani on 6/30/2017.
 */
public class ValidationDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = 0;
        boolean isNumber;

        System.out.println("Enter a whole number: ");

        do {
            if (scan.hasNextInt()) {
                num = scan.nextInt();
                isNumber = true;
            } else {
                System.out.println("Hey, you entered invalid data -- whole #'s only! ");
                System.out.println("Enter a new #: ");
                isNumber = false;
                scan.nextLine(); // this is used to clean out the scanner
            }

        } while (!(isNumber));

        System.out.println(num);

        String validatorTest = Validator.getString(scan, "Please enter a name: ");
        System.out.println(validatorTest);
    }
}
