/**
 * Created by fhani on 7/7/2017.
 */
public class question3 {
    public static void main(String[] args) {
        int[] array1 = {100, 56, 22, 50, 10,63, 15};
        int lowestNumFinal = 0;
        int lowestNum = array1[0];

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < array1[0]) {
                lowestNum = array1[i];
            }

        }
        for (int j = 0; j < array1.length; j++) {
            if (array1[j] < lowestNum) {
                lowestNumFinal = array1[j];
            }
        }

        System.out.println(lowestNumFinal);
    }


}
