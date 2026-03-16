
import java.util.HashMap;

public class Basic {

    public static void main(String[] args) {
        // create a hashmap
        HashMap<String, Integer> map = new HashMap<>();

        // Insert K:V pairs - PUT
        map.put("Sakshi", 20);
        map.put("Mayank", 21);
        map.put("Ayu", 7);
        map.put("Shikha", 34);

        // search value - GET
        System.out.println(map.get("Mayank"));

        // check if exists - CONTAINS KEY
        if (map.containsKey("Ayu")) {
            System.out.println("Ayu Found");
        }

        // update value - PUT
        map.put("Ayu", 6); //change ayu to 6

        // delete - REMOVE
        map.remove("Shikha");

        map.size(); //RETURNS SIZE BUT HASHMAPS AREN'T ORDERED

        // KeySet() - give all keys
        System.out.println(map.keySet());

        // value()
        System.out.println(map.values());

        // // all key:value pairs
        System.out.println(map.entrySet());

        // TRAVERSAL
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }


        // QUESTIONS: 
        // 1. create, store values and print
        HashMap<String, Integer> fruits = new HashMap<>();
        fruits.put("Guava", 3);
        fruits.put("banana", 5);
        fruits.put("apple", 2);

        // print
        System.out.println( fruits.entrySet() );

        // check if exists
        if(fruits.containsKey( "apple") ) System.out.println("Yes");


    }
}
