/**
 * Created by fhani on 6/29/2017.
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder ccNumber = new StringBuilder();
        ccNumber.append("2894");
        ccNumber.append("9384");
        ccNumber.append("9893");
        ccNumber.append("9222");

        System.out.println(ccNumber);

        StringBuffer name = new StringBuffer(8);
        int capacity = name.capacity();
        System.out.println(capacity);
        name.append("Antonella M. Solo");
        System.out.println(name.length());
        System.out.println(name.capacity());
        System.out.println(name);

    }
}

