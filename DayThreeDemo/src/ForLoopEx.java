/**
 * Created by fhani on 6/28/2017.
 */
public class ForLoopEx {
    public static void main(String[] args) {
        //System.out.println("hello");

        //for loop that stores numbers 0 - 4 in a string
        String numbers = "";

        for (int i = 0; i < 5; i++) {
            numbers += i; //implicit casting, changes int to string
            numbers += " ";
        }
        System.out.println(numbers);
    }
}
