/**
 * Created by fhani on 6/28/2017.
 */
public class WhileLoopInfinite {
    public static void main(String[] args) {
        //System.out.println("hello world");

        while (true) {
            //this code will run endlessly


            // to break out of this infinite loop, you will want to
            // include a conditional statement
            // to break out of the loop -- you can use the
            // keyword break
            // break;

            int randomNum = (int) (Math.random() * 10); //because want a random number from 0-10 (math.random gives from 0-1)
            //generating a random number
            System.out.println(randomNum);

            if (randomNum == 7) {
                System.out.println("value is found -- exit loop!"); //break statement (or would be an infinite loop
                break;
            }
        }
        // continue statement example
        System.out.println();
        System.out.println("continue statement example below");

        for (int i = 0; i < 5 ; i++) {
            int randomNum2 = (int) (Math.random() * 10);

            if (randomNum2 > 7) {
                System.out.println("This is an invalid value -- continue loop");
                continue;
            }
            System.out.println(randomNum2); //only execute if randomNum2 is less than or equal to 7
        }
    }
}