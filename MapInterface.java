import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {

    public static void main(String[] args) {
        
        /*
         * Basically HashMap is a implementation class of Map interface
         * 
         * Declaration of HashMap
         * 
         */

         HashMap<Integer, String> map = new HashMap<>();

        //  Example we need to store this type of data

        // (Integer)    (String)
        //  RollNo       Name

        //  101          Akshit
        //  102          Jack
        //  103          Jenny

        // Adding data inside the HashMap

        map.put(101, "Akshit");
        map.put(102, "Jack");
        map.put(103, "Jenny");

        // Printing the entire map

        System.out.println(map);

        // Printing the data corrosponds to the key

        System.out.println(map.get(102));

        // Check if a particular key exist or not inside the Hashmap

        boolean isExist = map.containsKey(69);
        System.out.println(isExist);

        // Check if a particular value exist or not inside the Hashmap 

        System.out.println(map.containsValue("Jack"));

        // How to print data in a Hashmap using a Loop

        Set<Integer> keys = map.keySet(); // All the keys are converted into Set

        for(int i : keys){
            System.out.println(map.get(i)); // Then we are getting the respective value for the corrosponding keys
        }

        // Another method to print all the data from the HashMap

        Set<Map.Entry<Integer,String>> entries = map.entrySet();

        for(Map.Entry<Integer,String> data : entries){
            data.setValue(data.getValue().toUpperCase());
        }

        System.out.println(map);

        // How to remove a particular data from the Hashmap

        map.remove(102);

        System.out.println(map);

    }
}