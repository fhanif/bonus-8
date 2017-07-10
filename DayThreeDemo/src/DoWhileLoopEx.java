/**
 * Created by fhani on 6/28/2017.
 */
public class DoWhileLoopEx {
    public static void main(String[] args) {
        //System.out.println("hello world");

        int i = 1;
        int month = 36;
        double futureValue = 0;
        double monthlyPmt = 330.63;
        double interestRate = 5.99/100; //5.99%

        do {
            futureValue = (futureValue + monthlyPmt) * (1 + interestRate);
            i++;
        } while (i <= month);
        System.out.println(futureValue);
    }
}
