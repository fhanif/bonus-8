import java.util.Scanner;

/**
 * Created by fhani on 7/6/2017.
 */
/*
    Methods example
    1. Create main method using psvm in class body
    2. Create another method called test1 returns void, no parameters
    3. Create another method called test2 returns void, 1 int parameter
    4. Create another method called test3 returns int, no parameters
    5. Create another method called test4 returns float, 1 Scanner class parameter
    6. Create another method called test5 returns a String, 3 float parameters
     */
public class MethodDemoReview {
    //1. Create main method using psvm in class body
    public static void main(String[] args) {
        MethodDemoReview methodDemo = new MethodDemoReview();
        methodDemo.test1();
        //just test1(); without declaring an object would work if test1 was static
        //can create an object if test1 isn't static
        //OR
        //(new MethodDemo()).test1(); -- want to create an object variable so can use over and over again

        test2(3); // would do MethodDemoReview.test2(3); if calling in another class

        test3();

        Scanner scan = new Scanner(System.in);
        MethodDemoReview.test4(scan);
        //or even
        float val = MethodDemoReview.test4(scan);

        String returnValue = MethodDemoReview.test5(3.14f, 1.14f, .349835f);
    }

    // 2. Create another method called test1 returns void, no parameters
    public  void test1() {

    }

    //3. Create another method called test2 returns void, 1 int parameter
    public static void test2(int parameter) {

    }

    //4. Create another method called test3 returns int, no parameters
    public static int test3() {
        return 0;
    }

    //5. Create another method called test4 returns float, 1 Scanner class parameter
    public static float test4(Scanner scnr) {
        return 0.0f; //otherwise won't work and will think its double
    }

    //6. Create another method called test5 returns a String, 3 float parameters
    public static String test5(float var, float var2, float var3) {
        return "";
    }

    //method overloading can work if different types of methods, different order of methods, or different number of parameters
    public static String test5(int var, float var2, float var3) {
        return "";
    }
}
