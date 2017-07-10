import java.util.Scanner;

/**
 * Created by fhani on 7/6/2017.
 */
public class ArraysEx {
    public static void main(String[] args) {

        //declare array
        int [] numbers =  new int [] {3,6,7,2,10}; //need to declare size in array if you don't initialize in first step
        // OR int[] numbers = new int [5];

//        numbers[0] = 3;
//        numbers[1] = 6;
//        numbers[2] = 7;
//        numbers[3] = 2;
//        numbers[4] = 10;

        for (int i = 0; i < numbers.length ; i++) {

            int val = numbers[i];

            if (val%2 == 0){//even
                System.out.println("Even: " + val);
            }
            else {//odd
                System.out.println("Odd: " + val);
            }

        }

    }





    // 2. Create another method called test1 returns void, no parameters
    public void test1() {

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


