import java.util.HashMap;
import java.util.Map;

/**
 * Created by fhani on 7/6/2017.
 */
public class HashMapDemo {
    public static void main(String[] args) {
        // HashMap Object - needs a key and value pair
        HashMap<Integer, String> map = new HashMap<>();

        // when adding to the HashMap the types and order need to match
        map.put(6, "Aaron");
        map.put(8, "Vernon");

        String playerName = map.get(6);

        System.out.println(playerName);

        for (Map.Entry<Integer, String> mapLoop : map.entrySet()) {
            int key = mapLoop.getKey();
            String value = mapLoop.getValue();

            System.out.println(key + " : " + value);

        }


    }
}
