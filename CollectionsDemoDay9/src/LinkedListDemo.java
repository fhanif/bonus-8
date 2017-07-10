import java.util.LinkedList;

/**
 * Created by fhani on 7/6/2017.
 */

//LinkedList is more efficient at adding elements in the middle, but not as easy when searching
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();

        list1.add("Mark");
        list1.add("Travis");
        list1.add("Farha");
        list1.add("Ny");

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));

        }

        //.remove will remove first element if index of element to be removed is not specified
        System.out.println();
        list1.remove();
        System.out.println(list1);
    }
}
