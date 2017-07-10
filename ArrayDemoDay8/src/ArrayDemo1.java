import java.util.Arrays;

/**
 * Created by fhani on 7/5/2017.
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        // example 1: declaring and initializing
        char [] arr = new char[4];

        arr[0] = 'a';
        arr[1] = 'b';
        arr[2] = 'c';
        arr[3] = 'd';
        System.out.println(arr[2]);

        //example 2: declaring, initializing, and populating values

        char[] arr1 = {'a','b','c','d'};

        //example 3: using fill method

        double[] arr2 = new double[3];

        Arrays.fill(arr2, 1.25);
        //System.out.println(arr2[2]);

        // for loop to iterate through arr2
        int lengthTest = arr2.length;

        double sum = 0;
        for (int i = 0; i < arr2.length; ++i) {

            sum += arr2[i];
           // sum = sum + arr2[i]; // same thing

            System.out.println(sum); // will print for every iteration -- put outside of for loop for printing once
        }

        System.out.println(arr2);
        System.out.println(Arrays.toString(arr2));

        System.out.println();
        // example 4: foreach loop

        int [] arr3 = {32, 43, 21, 67};
        for (int loopTest : arr3) {

            System.out.println(loopTest); //disadvanatage is don't have access to index location
        }
    }
}
