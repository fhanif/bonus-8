import java.util.Arrays;

/**
 * Created by fhani on 7/5/2017.
 */
public class Array2DEx {
    public static void main(String[] args) {
        // example 1: declare and initialize

        String[][] arr = new String [7][7]; //print out statement with .toString would print null

        arr[0][0] = "Antonella";

        System.out.println(Arrays.toString(arr)); //need nested for loop to properly see these values

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.println(arr[i][j]);

            }

        }

        // jagged 2D example

        int [][] arr2 = new int[5][]; //each column may fluctuate
//        arr2[0][0] = 34;
//        arr2[1][0] = 55;
        //slide 210 look over- confusing

        int [][] numbers = {{1,2,4,6,7},
                            {4,6,8,9,12,45},
                            {56,65}};

        System.out.println();

        int sum = 0;
        for (int[] row: numbers) {
            for (int column: row) {
               sum += column;

            }

        }
        System.out.println(sum);

    }
}
