/**
 * Created by fhani on 7/5/2017.
 */
public class ParallelArrayEx {
    public static void main(String[] args) {
        String [] names = {"Joya", "Jayme", "Ny", "Steve"};

        int[] jerseyNum = {3, 7, 19, 55};

        for (int i = 0; i < names.length ; i++) {
            System.out.printf("Student Name: %s  Jersey Number: %d \n", names[i], jerseyNum[i]);

        }
    }
}

