import java.util.Scanner;

/**
 * Created by fhani on 6/29/2017.
 */
public class MethodPractice {
    //this space is ok for methods
    //method should not be inside the main method
    public static void main(String[] args) {
        countDown(10);

//        Scanner scan = new Scanner(System.in);

//        String Farha = printName();
//        System.out.println(Farha);
//
//        printName2();
//
//        System.out.println(setAge());
//        // or -- System.out.println(printName);

//        System.out.println("Please enter your age in years: ");
//        int userAge = scan.nextInt();
//
//        System.out.println(setAge(userAge));
    }

    // this space is ok for methods

    // String method to display a name
    public static String printName() {
        //only need return statement because declared a return type instead of void
        String name = "Farha";
        return name;
    }
    // void method that displays a name
    public static void printName2() {
        System.out.println("My name is Farha");
    }

    public static int setAge () {
        int ageDays = 0;
        int years = 32;
        ageDays = years * 365;
        return ageDays;
    }
    // example of an overloaded method
    public static int setAge (int years) {
        int ageDays = years * 365;
        return ageDays;
    }

    public static void countDown(int count){
        if (count == 0) {
            System.out.println("Go");
        }
        else {
            System.out.println(count);
            countDown(count - 1);
        }
    }

}
