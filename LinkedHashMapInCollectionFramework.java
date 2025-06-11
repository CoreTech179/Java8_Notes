import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapInCollectionFramework {
    public static void main(String[] args) {
        
        /*
         * Declaration of Linked Hash Map
         */

         LinkedHashMap<Integer, String> lmap = new LinkedHashMap<>();

        //  Adding elements to the LinkedHashMap

         lmap.put(1, "Akash");
         lmap.put(2, "Jenny");
         lmap.put(3, "Jack");

        // Printing data one by one by using a loop

        for(Map.Entry<Integer, String> entry : lmap.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


        // Some methods are missed at Hashmap but we can use these same methods in HashMap

        // Get the Value for the corrosponding Key or else default value will be printed

        System.out.println(lmap.getOrDefault(10, null));

        // Put data if not exist

        lmap.putIfAbsent(2, "Puma"); // Since key = 2 exist therefore data is not put into the map

        System.out.println(lmap);

    }
}
