import java.util.ArrayList;

/**
 * Created by fhani on 7/6/2017.
 */

//ArrayList is better for searching but not as efficient at adding elements in the middle

public class ArrayListDemo {
    public static void main(String[] args) {
        //declare an arraylist of Strings
        ArrayList<String> list1 = new ArrayList<String>(); //don't need to add <String> at end after java 7
                                                        //don't need capacity in () either

        // add items to the arraylist
        list1.add("Mark");
        list1.add("Eric");
        list1.add("Vernon");

        System.out.println(list1); //printed like printing array with .toString (with [])
        System.out.println();

        //for i loop uses the .size method instead of .length like in arrays
        for (int i = 0; i < list1.size(); i++) {

            System.out.println(list1.get(i));

        }

        System.out.println("Begin for each loop");

        //foreach loop
        for (String loop: list1) {
            System.out.println(loop);
        }


        list1.add(0, "Aaron");

        System.out.println();

        System.out.println(list1);

        //this .set method is used to replace elements
        list1.set(0,"Michael");

        System.out.println();

        System.out.println(list1);

    }

}
