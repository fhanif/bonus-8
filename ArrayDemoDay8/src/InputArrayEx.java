import java.util.Scanner;

/**
 * Created by fhani on 7/5/2017.
 */
public class InputArrayEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter in a size for our array: ");
        int arraySize = scan.nextInt();

        int[] arr = new int[arraySize];

        System.out.println(arr.length);
        fillArray(scan, arr);


        // System.out.println(arr); - will only give location
        //using foreach loop to print without brackets
        for (int i: arr) {
            System.out.println(i);
        }

    }

    public static void fillArray(Scanner scan, int[] arr) {
        //assigning user entered values to the index positions
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Please enter a number for index " + i + ": ");
            int userNum = scan.nextInt();
            arr[i] = userNum;

        }
    }

}
