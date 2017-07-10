import java.util.Scanner;

/**
 * Created by fhani on 7/7/2017.
 */
public class question2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);
        System.out.println("enter an integer");
        int number = scnr.nextInt();
        check(number);

    }

    public static boolean check (int number) {
        if (number == 0) {
            System.out.println("equal to zero");
        } else
            System.out.println("not equal to zero");
        return true;
    }


//        Scanner scnr = new Scanner (System.in);
//        System.out.println("Enter an integer");
//        if (scnr.hasNextInt()) {
//            System.out.println("Invalid entry. Please enter a positive integer value.");
//            scnr.next();
//        double userInput = scnr.nextdouble();

}
