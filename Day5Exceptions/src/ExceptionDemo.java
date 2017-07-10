import java.util.Scanner;

/**
 * Created by fhani on 6/30/2017.
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in); // need to declare scanner outside of while loop!!

        //this program will catch for invalid input
        String choice = "y";

        while(choice.equalsIgnoreCase("y")) {
            //get input from user

            System.out.println("Enter a monthly investment: ");

            double monthlyInv;

            try {
                String line = scan.nextLine();
                monthlyInv = Double.parseDouble(line); //you can also directly pass in scan.nextLine();

            } catch (NumberFormatException e){
                System.out.println("Error! Invalid number.");
                continue; //this will push program back to beginning of while loop
            }



            System.out.println(monthlyInv);
            System.out.println("Continue? (y/n): ");
            choice = scan.nextLine();

        }
    }
}
