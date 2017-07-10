import java.util.Arrays;

/**
 * Created by fhani on 7/5/2017.
 */
public class ArrayCopyOfEx {
    public static void main(String[] args) {

        int[] arr = {3, 6, 9 , 12};

        // DO NOT DO THIS!!!
        int[] arr2 = arr;

        System.out.println(arr);
        System.out.println(arr2); // prints out same location --

        System.out.println();

        arr2[0] = 13; // both arrays referring to same place in memory
        //changing arr2 changes arr -- look below print statements

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        // If you want a copy -- DO THIS!

        int [] arr3 = {3 ,6 ,9, 12};

        int[] arr4 = Arrays.copyOf(arr3, arr3.length);

        arr4[0] = 13;

        System.out.println();
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
    }
}
