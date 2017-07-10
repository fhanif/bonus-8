import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by fhani on 7/6/2017.
 */
public class CodeChallenge1 {
    public static void main(String[] args) {
        int userInput = 0;
        String keepGoing = "";
        Scanner scnr = new Scanner(System.in);

        do {
            System.out.println("enter 9 numbers divided by one space");

            int[][] arr = new int[3][3];

            while (!scnr.hasNextInt()) {
                System.out.println("Invalid entry! Enter an integer.");
                scnr.next();
            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    userInput = scnr.nextInt();
                    arr[i][j] = userInput;
                }
            }
            int sum = 0;
            for (int[] row : arr) {
                for (int column : row) {
                    sum += column;
                }
            }
            sum -= arr[1][0];
            sum -= arr[1][2];
            System.out.println("The sum of values in the hourglass array is: " + sum);

            System.out.println("Would you like to continue? (Y/N)");
            System.out.println();
            scnr.nextLine();
            keepGoing = scnr.nextLine();

        } while (keepGoing.equalsIgnoreCase("y") && (!keepGoing.equalsIgnoreCase("N")));
    }
}


